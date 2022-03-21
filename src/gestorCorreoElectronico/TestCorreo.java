package gestorCorreoElectronico;

import java.util.Scanner;

public class TestCorreo {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            Scanner tec = new Scanner(System.in);

            System.out.print("Correo numero " + i);

            System.out.print("Introduce el emisor: ");
            String emisor = tec.nextLine();

            System.out.print("Introduce el destinatario: ");
            String destinatario = tec.nextLine();

            System.out.print("Introduce el asunto: ");
            String asunto = tec.nextLine();

            System.out.print("Introduce texto del mensaje: ");
            String texto = tec.nextLine();

            Mensaje mensaje = new Mensaje(emisor, destinatario, asunto, texto);
            System.out.print(mensaje + "\n");
        }
    }

}
