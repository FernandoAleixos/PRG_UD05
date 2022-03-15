package fechas;

import java.time.LocalDate;
import java.time.Period;

public class Act_2_20 {

    private int codigo;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private double calificaciones;

    public Act_2_20(int codigo, String nombre, String apellidos, LocalDate fechaNacimiento, double calificaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.calificaciones = calificaciones;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        LocalDate fechaActualizada = LocalDate.now();
        Period diferencia = Period.between(fechaNacimiento, fechaActualizada);
        int edad = diferencia.getYears();

        return "Alumno{" +
                " codigo = " + codigo +
                ", nombre = '" + nombre + '\'' +
                ", apellidos = '" + apellidos + '\'' +
                ", fechaNacimiento = " + fechaNacimiento +
                ", calificaciones = " + calificaciones +
                ", edad = " + edad +
                '}';
    }

    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(1990, 10, 05);
        Act_2_20 alumno = new Act_2_20(1, "Luis", "Mas Ros", fecha1, 7.5);
        System.out.println(alumno);
    }
}
