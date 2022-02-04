package gestionHospital;

public class Paciente {

    private String nombre;
    private int edad;
    private int estado;

    //constructor
    public Paciente(String n, int e) {
        this.nombre = n;
        this.edad = e;
        this.estado = (int)(Math.random() * 5) + 1;
    }

    //getters
    public int getEdad() {
        return this.edad;
    }

    public int getEstado() {
        return estado;
    }

    //metodos de la clase
    //mejora al paciente
    public void mejorar() {
        Paciente.this.estado++;
    }

    //emperora al paciente
    public void empeorar() {
        Paciente.this.estado--;
    }

    @Override
    public String toString() {
        return this.nombre + "" + this.edad + " " + this.estado + "\n";
    }

    public int compareTo(Paciente o) {
        int gravedad = o.getEstado() - this.getEstado();

        if (gravedad == 0) {
            gravedad = o.getEstado() - this.getEstado();
        }
        return gravedad;
    }
}
