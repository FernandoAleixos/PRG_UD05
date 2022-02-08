package gestionHospital;

import java.util.Arrays;

public class Hospital {

    //atributos
    private final int MAXC = 200;
    private Paciente[] listaCamas;
    private int numLibres;


    //constructor
    public Hospital() {
        this.listaCamas = new Paciente[MAXC + 1];
        this.numLibres = MAXC;
    }

    //getters y setters
    //Consultor del número de camas libres.
    public int getNumLibres() {
        return numLibres;
    }

    //métodos
    //Devuelve true si en el hospital hay camas libre y devuelve false en caso contrario.
    public boolean hayLibres() {
        return (this.numLibres > 0);
    }

    //Devuelve el número de la primera cama libre
    //del array listaCamas si hay camas libres o devuelve un 0 si no las hay.
    public int primeraLibre() {
        boolean estaLibre = false;
        for (int i = 1; i < listaCamas.length && !estaLibre; i++) {
            if (listaCamas[i] == null) {
                estaLibre = true;
                return i;
            }
        }
        return 0;
    }

    // Si hay camas libres, la primera de ellas (la de
    //número menor) pasa a estar ocupada por el paciente de nombre n y edad e.
    //Si no hay camas libres, lanza una excepción.
    public void ingresarPaciente(String n, int e) throws HospitalLlenoException {
        Paciente paciente1 = new Paciente(n, e);

        if (hayLibres()) {
            listaCamas[primeraLibre()] = paciente1;
            numLibres--;
        } else {
            throw new HospitalLlenoException();
        }
    }

    //Excepción Hospital lleno.
    class HospitalLlenoException extends Exception {
    }

    //La cama i del hospital pasa a estar libre. (Afectará al número de camas libres)
    private void darAltaPaciente(int i) {
        if (i > 0) {
            listaCamas[i] = null;
            numLibres++;
        } else {
            System.out.println("ERROR, No se ha dado de alta porque no existe la cama 0");
        }
    }

    //Se mejora el estado (método mejorar() de Paciente)
    //de cada uno de los pacientes del hospital y a aquellos pacientes
    //sanos (cuyo estado es 6) se les da el alta médica (invocando al método darAltaPaciente ).
    public void darAltas() {
        boolean hayPaciente = false;

        for (int i = 1; i < listaCamas.length; i++) {

            if (listaCamas[i] != null){
                listaCamas[i].mejorar();
                if (listaCamas[i].getEstado() == 6) {
                    darAltaPaciente(i);
                    numLibres++;
                }
            }
        }
    }

    //Devuelve un String con la información de las camas del hospital.
    @Override
    public String toString() {
        String resultado = "";

        for (Paciente paciente : listaCamas) {
            if (paciente != null) {
                resultado += paciente.toString();
            } else {
                resultado += "Libre\n";
            }
        }
        return resultado;
    }
}


