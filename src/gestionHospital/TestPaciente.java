package gestionHospital;

public class TestPaciente {


    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Antonio", 20, 5);
        Paciente paciente2 = new Paciente("Miguel", 30, 3);

        System.out.println(paciente1.getEstado());
        System.out.println(paciente2.getEstado());

        if (paciente1.compareTo(paciente2) < 0){
            System.out.println(paciente1);
        } else {
            System.out.println(paciente2);
        }




    }
}
