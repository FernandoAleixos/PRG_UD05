package fechas;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Act_2_7 {
    //Introduce un dia para la fecha: 29
    //Introduce un mes para la fecha: 2
    //Introduce un año para la fecha: 2022
    //LA FECHA ES INCORRECTA

    //Introduce un dia para la fecha: 29
    //Introduce un mes para la fecha: 2
    //Introduce un año para la fecha: 2020
    //LA FECHA ES CORRECTA

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        GregorianCalendar calendari = new GregorianCalendar();

        System.out.print("Introduce un día para la fecha: ");
        int dia = tec.nextInt();
        tec.nextLine();

        System.out.print("Introduce un mes para la fecha: ");
        int mes = tec.nextInt();
        tec.nextLine();

        System.out.print("Introduce un año para la fecha: ");
        int anyo = tec.nextInt();
        tec.nextLine();

        LocalDate fecha = LocalDate.of(anyo, mes, dia);



    }
}
