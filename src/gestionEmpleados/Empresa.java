package gestionEmpleados;

import java.util.Arrays;

class Empresa {
	private static final int MAX_EMPLEADOS = 10;

	//atributos de la clase
	private String nombre;
	private Empleado[] plantilla;
	private int numEmpleados;

	//constructor
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.plantilla = new Empleado[MAX_EMPLEADOS];
		this.numEmpleados = 0;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado[] getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Empleado[] plantilla) {
		this.plantilla = plantilla;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	//metodos de la clase
	public void contratar(Empleado e) throws PlantillaCompletaException {
		if (this.numEmpleados < MAX_EMPLEADOS) {
			this.plantilla[this.numEmpleados++] = e;
		} else {
			throw new PlantillaCompletaException();
		}
	}

	class PlantillaCompletaException extends Throwable {
	}

	public void despedir(Empleado e) throws ElementoNoEncontradoException {
		//buscar el empleado en una posición del array
		int posicionEncontrado = 0;
		boolean encontrado = false;

		for (int posicion = 0; posicion < plantilla.length - 1 && !encontrado; posicion++) {
			if (plantilla[posicion].equals(e)){
				encontrado = true;
				posicionEncontrado = posicion;
			}
		}
		if (encontrado) {
			//borramos empleado
			for (int contador = posicionEncontrado; contador < plantilla.length - 1; contador++) {
				plantilla[contador] = plantilla[contador + 1];
			}
			plantilla[MAX_EMPLEADOS - 1] = null;
			this.numEmpleados--;
		} else {
			throw new ElementoNoEncontradoException();
		}
	}

	class ElementoNoEncontradoException extends Throwable {
	}

	public void subirTrienio(double porcentaje) {
		for (int pos = 0; pos < this.plantilla.length; pos++) {
			if (plantilla[pos] != null && plantilla[pos].antiguedad() % 3 == 0){
				//subimos trienio
				plantilla[pos].incrementarSueldo(porcentaje);
			}
		}
	}

	@Override
	public String toString() {
		String resultado = nombre + "\nEmpleados:";
		for (int pos = 0; pos < plantilla.length; pos++) {
			if (plantilla[pos] != null) {
				resultado += plantilla[pos].toString() + '\n';
			}
		}
		return resultado;
	}
}
