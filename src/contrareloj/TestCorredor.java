package contrareloj;

import java.util.Scanner;

//Diseñar una clase Java TestCorredor que permita probar la clase Corredor y sus
//métodos. Para ello se desarrollará el método main en el que:
public class TestCorredor {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Se crearán dos corredores: El nombre lo indicará el usuario mientras que el
        //dorsal se generará utilizando el método generarDorsal() de la clase.
        System.out.print("Indica el nombre del corredor1: ");
        String n1 = tec.next();
        Corredor corredor1 = new Corredor(Corredor.generarDorsal(), n1);

        System.out.print("Indica el nombre del corredor2: ");
        String n2 = tec.next();
        Corredor corredor2 = new Corredor(Corredor.generarDorsal(), n2);

        //Se establecerá el tiempo de llegada del primer corredor a 300 segundos y el del
        //segundo a 400.
        corredor1.setTiempo(300);
        corredor2.setTiempo(400);

        //Se mostrarán los datos de ambos corredores ( toString )
        System.out.println("\nDatos del corredor1: " + corredor1);
        System.out.println("Datos del corredor2: " + corredor2);
    }
}
