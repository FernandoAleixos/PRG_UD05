package fechas;
//Introducir dos fechas e indicar los días transcurridos entre las dos fechas.

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Act_2_8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce la fecha inicial con formato dd/mm/yyyy: ");
        LocalDate fecha1 = LocalDate.parse(tec.nextLine());

        System.out.print("Introduce la fecha final con formato dd/mm/yyyy: ");
        LocalDate fecha2 = LocalDate.parse(tec.nextLine());

        System.out.print("La fecha inicial es: " + fecha1);
        System.out.print("La fecha final es: " + fecha2);

        Period periodo1 = Period.between(fecha1, fecha2);

        System.out.print("Entre la fecha inicial y la final hay un periodo de: " + periodo1);

        System.out.print("dias: ");
        System.out.print("meses: ");
        System.out.println("años: ");


    }

}
