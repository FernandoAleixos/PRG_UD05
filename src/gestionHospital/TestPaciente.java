package gestionHospital;

public class TestPaciente {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Antonio", 20);
        Paciente paciente2 = new Paciente("Miguel", 30);

        System.out.println("Estado del paciente 1: " + paciente1.getEstado());
        System.out.println("Estado del paciente 2: " + paciente2.getEstado());

        if (paciente1.compareTo(paciente2) < 0){
            System.out.println(paciente1);
        } else {
            System.out.println(paciente2);
        }

        while (paciente1.getEstado() != paciente2.getEstado()) {
            if (paciente1.getEstado() < paciente2.getEstado()) {
                paciente1.mejorar();
            } else {
                paciente2.mejorar();
            }
        }

        System.out.println("El estado final del paciente 1 es:" + paciente1);
        System.out.println("El estado final del paciente 2 es:" + paciente2);
    }
}
