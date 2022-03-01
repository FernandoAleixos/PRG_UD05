package wrappers;

import java.util.Scanner;

public class _2_Actividades {
    //1. Introducir por teclado un valor de tipo double y convertirlo en Wrapper.
    /*public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double d1 = tec.nextDouble();
        Double d2 = new Double(d1);

        System.out.println("d1 = " + d2.toString());
    }*/


    //2. Introducir por teclado un valor numérico en un String y convertirlo en entero.
    /*public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        String c1 = tec.nextLine();
        int c2 = Integer.parseInt(c1);


        System.out.println("c1 = " + c2);
    }*/


    //3. Introducir por teclado un valor numérico entero en un String y convertirlo en un
    //Wrapper.
    /*public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        String f1 = tec.nextLine(); //f1="3.14";
        Float float1 = new Float(f1);

        System.out.println(float1.toString());
    }*/


    //4. Introducir por teclado dos valores numéricos enteros y la operación que queremos
    //realizar ( suma , resta o multiplicación ). Realizar la operación y mostrar el resultado en
    //Binario , Hexadecimal y Octal.
    /*public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        Integer i1 = new Integer(tec.nextInt());

        System.out.println("Introduce el segundo número: ");
        Integer i2 = new Integer(tec.nextInt());

        Integer suma = i1 + i2;
        Integer resta = i1 - i2;
        Integer multi = i1 * i2;

        //Decimal
        System.out.println("-Decimal-");
        System.out.println(Integer.toString(suma, 10));
        System.out.println(Integer.toString(resta, 10));
        System.out.println(Integer.toString(multi, 10));

        //Hexadecimal
        System.out.println("-Hexadecimal-");
        System.out.println(Integer.toHexString(suma));
        System.out.println(Integer.toHexString(resta));
        System.out.println(Integer.toHexString(multi));

        //Binario
        System.out.println("-Binario-");
        System.out.println(Integer.toString(suma, 2));
        System.out.println(Integer.toString(resta, 2));
        System.out.println(Integer.toString(multi, 2));
    }*/
}
