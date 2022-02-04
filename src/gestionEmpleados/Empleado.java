package gestionEmpleados;

import java.util.Calendar;

class Empleado {
    private static final int SMI = 15000;

    //atributos de la clase
    private String nombre;
    private String dni;
    private int anyoIngreso;
    private double sueldoBrutoAnual;

    //metodos de la clase
    //constructor-------------------------------------------------------------------------------------------------------
    public Empleado(String nombre, String dni, int anyoIngreso, double sueldoBrutoAnual) {
        this.nombre = nombre;
        this.dni = dni;
        this.anyoIngreso = anyoIngreso;
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.anyoIngreso = Calendar.getInstance().get(Calendar.YEAR);
        this.sueldoBrutoAnual = SMI;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //getters----------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public double getSueldoBrutoAnual() {
        return sueldoBrutoAnual;
    }

    public int getAnyoIngreso() {
        return anyoIngreso;
    }

    public String getDni() {
        return dni;
    }

    //setters-----------------------------------------------------------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }

    public void setAnyoIngreso(int anyoIngreso) {
        this.anyoIngreso = anyoIngreso;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int antiguedad() {
        int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
        return Math.max(0, anyoActual - this.anyoIngreso);
    }

    //opción corta
    public void incrementarSueldo(double porcentaje) {
        //sumponemos que el porcentaje es entre un 0 y 100//
        //this.sueldoBrutoAnual = (this.sueldoBrutoAnual * (1 + (porcentaje / 100)));
        this.sueldoBrutoAnual *= (1 + (porcentaje / 100));
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nDni: " + dni
                + "\nAñoIngreso: " + anyoIngreso
                + "\nSueldoBrutoAnual: " + sueldoBrutoAnual + " €";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Empleado empleado = (Empleado) o;
        return dni.equals(empleado.dni);
    }

    public int compareTo(Empleado o) {
        return this.getDni().compareTo(o.getDni());
    }

    public static double calcularIRPF(double salario) {
        double irpf = 0;
        salario /= 12;

        if (salario >= 0 && salario < 800) {
            irpf = 3;
        } else if (salario < 1000) {
            irpf = 10;
        } else if (salario < 1500) {
            irpf = 15;
        } else if (salario < 2100) {
            irpf = 20;
        } else if (salario >= 2100) {
            irpf = 30;
        }
        return irpf;
    }
}
