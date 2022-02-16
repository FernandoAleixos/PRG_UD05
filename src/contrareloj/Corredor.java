package contrareloj;

import java.util.Objects;

//La clase Corredor representa a un participante en la carrera. Sus atributos son el dorsal
//(entero), el nombre (string) y el tiempo en segundos (double) que le ha costado
//completar el recorrido. Los métodos con los que cuenta son:
public class Corredor {

    //Atributos
    private int dorsal;
    private String nombre;
    private double tiempo;
    static int siguienteDorsal = 1;

    public Corredor(int d, String n) {
        this.dorsal = d;
        this.nombre = n;
        this.tiempo = 0;
    }

    //Getters
    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    /**Este método devuelve el tiempo del corredor en double**/
    public double getTiempo() {
        return tiempo;
    }

    //Métodos de la clase
    //Establece el tiempo tardado por el corredor.
    //Lanzará la excepción si el tiempo indicado es negativo.
    public void setTiempo(double t) throws IllegalArgumentException {
        if (tiempo >= 0) {
            this.tiempo = t;
        } else {
            throw new IllegalArgumentException();
        }
    }

    //Establece el tiempo tardado por el corredor.
    //t1 indica la hora de comienzo y t2 la hora de finalización (expresada en segundos).
    //La diferencia en segundos entre los dos datos servirá para establecer el tiempo tardado por el Corredor.
    public void setTiempo(double t1, double t2) throws IllegalArgumentException {
        double diferencia = t2 - t1;
        this.setTiempo(diferencia);
    }

    //Devuelve un String con los datos del corredor, de la forma:
    //(234) - Juan Ramirez - 2597 segundos
    @Override
    public String toString() {
        return "(" + dorsal + ") - " + nombre + " - " + tiempo + " segundos";
    }

    //Devuelve true si los corredores tienen el mismo dorsal y false en caso contrario
    @Override
    public boolean equals(Object o) {
        if (this == o) { //Si són el mismo objeto devuelve true
            return true;
        }
        if (o == null || getClass() != o.getClass()) { //Si el objeto es null o las clases no són iguales devuelve false
            return false;
        }

        Corredor corredor = (Corredor) o; //Igualamos el objeto corredor con el objeto que nos pasan por parámetros

        return (this.dorsal == corredor.dorsal); //Devolvemos una condición que compara el dorsal con el dorsal del objeto corredor
    }

    //Un corredor es menor que otro si tiene menor dorsal.
    public int compareTo(Corredor o) {
        return (this.getDorsal() - o.getDorsal()); //Si devuelve un número negativo el primer corredor tendrá el dorsal menor
    }

    // Devuelve un número de dorsal generado secuencialmente.
    //Para ello la clase hará uso de un atributo static int siguienteDorsal
    //que incrementará cada vez que se genere un nuevo dorsal.
    public static int generarDorsal() {
        return siguienteDorsal++; //Primero devolvemos el siguiente dorsal y luego se incrementa
    }
}
