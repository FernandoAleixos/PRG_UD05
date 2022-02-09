package gestionHospital;

public class GestionHopital {
    public static void main(String[] args) {
        //Crear un hospital
        Hospital hospital1 = new Hospital();

        //Ingresar a cinco pacientes
        try {
            hospital1.ingresarPaciente("María Medina", 30);
        } catch (Hospital.HospitalLlenoException e) {
            System.out.println("ERROR, el hospital esta lleno.");
        }

        try {
            hospital1.ingresarPaciente("Pepe Pérez", 46);
        } catch (Hospital.HospitalLlenoException e) {
            System.out.println("ERROR, el hospital esta lleno.");
        }

        try {
            hospital1.ingresarPaciente("Juan López", 5);
        } catch (Hospital.HospitalLlenoException e) {
            System.out.println("ERROR, el hospital esta lleno.");
        }

        try {
            hospital1.ingresarPaciente("Andrés Alepuz", 29);
        } catch (Hospital.HospitalLlenoException e) {
            System.out.println("ERROR, el hospital esta lleno.");
        }

        try {
            hospital1.ingresarPaciente("Juanjo Martínez", 76);
        } catch (Hospital.HospitalLlenoException e) {
            System.out.println("ERROR, el hospital esta lleno.");
        }

        //Comprobamos el hospital antes de dar de alta
        System.out.println("-ANTES-");
        System.out.println(hospital1);

        //Realizar proceso de darAlta
        while (hospital1.getNumLibres() < 198) {
            hospital1.darAltas();
        }

        //Comprobamos el hospital después de dar de alta
        System.out.println("\n-DESPUÉS-");
        System.out.println(hospital1);
    }
}
