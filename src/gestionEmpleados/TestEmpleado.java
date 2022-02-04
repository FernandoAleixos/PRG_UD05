package gestionEmpleados;

import java.util.Scanner;

class TestEmpleado {
	//atributos de la clase

	//metodos de la clase
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("INTRODUCE LOS DATOS DEL EMPLEADO\n");
		System.out.print("Introduce el nombre: ");
		String nombre1 = tec.next();
		System.out.print("Introduce el dni: ");
		String dni1 = tec.next();
		System.out.print("Introduce el año de ingreso: ");
		int anyoIngreso1 = tec.nextInt();
		tec.nextLine();
		System.out.print("Introduce el sueldo bruto anual: ");
		double sueloBrutoAnual1 = tec.nextDouble();

		System.out.print("INTRODUCE LOS DATOS DEL EMPLEADO\n");
		System.out.print("Introduce el nombre: ");
		String nombre2 = tec.next();
		System.out.print("Introduce el dni: ");
		String dni2 = tec.next();
		System.out.print("Introduce el año de ingreso: ");
		int anyoIngreso2 = tec.nextInt();
		tec.nextLine();
		System.out.print("Introduce el sueldo bruto anual: ");
		double sueloBrutoAnual2 = tec.nextDouble();

		Empleado empleado1 = new Empleado(nombre1, dni1, anyoIngreso1, sueloBrutoAnual1);
		Empleado empleado2 = new Empleado(nombre2, dni2, anyoIngreso2, sueloBrutoAnual2);

		System.out.println(empleado1);
		System.out.println(empleado2);

		//Se incrementa el sueldo 20% al empleado
		if (empleado1.getSueldoBrutoAnual() < empleado2.getSueldoBrutoAnual()){
 			empleado1.incrementarSueldo(20);
		} else {
			empleado2.incrementarSueldo(20);
		}


		//Se incrementa el sueldo un 10% al empelado más antiguo
		if (empleado1.getAnyoIngreso() < empleado2.getAnyoIngreso()) {
			//empleado1 es más antiguo
			empleado1.incrementarSueldo(10);
		} else {
			//empelado2 es más antiguo
			empleado2.incrementarSueldo(10);
		}

		System.out.println(empleado1);
		System.out.println(empleado2);

		//Muestra el IRPF
		System.out.println("\nEl IRPF del empleado1 es: "
				+ Empleado.calcularIRPF(empleado1.getSueldoBrutoAnual()));

		System.out.println("El IRPF del empleado2 es: "
				+ Empleado.calcularIRPF(empleado2.getSueldoBrutoAnual()));
	}
}
