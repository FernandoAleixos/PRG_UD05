package gestionEmpleados;

class TestEmpresa {
	//atributos de la clase
	
	
	
	//metodos de la clase
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("CataDAW");
		Empleado empleado1 = new Empleado("David", "77777777A", 1999, 22000);
		Empleado empleado2 = new Empleado("David", "22222222B", 2019, 19000);
		Empleado empleado3 = new Empleado("David", "33333333C", 2019, 21000);

		try {
			empresa1.contratar(empleado1);
		} catch (Empresa.PlantillaCompletaException ex) {
			System.out.println("ERROR: No se ha podido contratar al empleado1");
		}

		try {
			empresa1.contratar(empleado2);
		} catch (Empresa.PlantillaCompletaException ex) {
			System.out.println("ERROR: No se ha podido contratar al empleado2");
		}

		try {
			empresa1.contratar(empleado3);
		} catch (Empresa.PlantillaCompletaException ex) {
			System.out.println("ERROR: No se ha podido contratar al empleado3");
		}

		System.out.println(empresa1);

		empresa1.subirTrienio(10);

		System.out.println(empresa1);

		try{
			empresa1.despedir(empleado1);
		} catch (Empresa.ElementoNoEncontradoException ex) {
			System.out.println("ERROR: No se ha podido despedir al empleado1");
		}
		System.out.println(empresa1);

		Empleado empleado4 = new Empleado("Maria", "4444444D", 2022, 18000);

		try {
			empresa1.contratar(empleado4);
		} catch (Empresa.PlantillaCompletaException ex) {
			System.out.println("ERROR: No se ha podido contratar al empleado4");
		}

	}
}
