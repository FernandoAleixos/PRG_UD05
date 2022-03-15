package fechas;
//Introducir dos fechas e indicar los días transcurridos entre las dos fechas.

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act_2_8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/u");

        System.out.print("Introduce la fecha inicial con formato dd/mm/yyyy: ");
        String primeraFecha = tec.nextLine();
        LocalDate fecha1 = LocalDate.parse(primeraFecha, formato);

        System.out.print("Introduce la fecha final con formato dd/mm/yyyy: ");
        String segundaFecha = tec.nextLine();
        LocalDate fecha2 = LocalDate.parse(segundaFecha, formato);

        System.out.print("La fecha inicial es: " + fecha1.format(formato));
        System.out.print("La fecha final es: " + fecha2.format(formato));

        Period periodo1 = Period.between(fecha1, fecha2);

        System.out.print("Entre la fecha inicial y la final hay un periodo de: " + periodo1);

        System.out.print("dias: " + periodo1.getDays());
        System.out.print("meses: " + periodo1.getMonths());
        System.out.println("años: " + periodo1.getYears());


    }

}
