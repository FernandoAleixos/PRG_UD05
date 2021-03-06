package juegoDeCartas;

public class Carta {
    public static final int OROS = 0;
    public static final int COPAS = 1;
    public static final int ESPADAS = 2;
    public static final int BASTOS = 3;

    private int palo;
    private int valor;

    public Carta() {
        this.palo = (int) ((Math.random() * 3) + 1);
        this.valor = (int) ((Math.random() * 12) + 1);
    }

    public Carta(int palo, int valor) throws IllegalArgumentException {

        if (palo <= BASTOS || valor <= 12) {
            this.palo = palo;
            this.valor = valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //Escribir un método compareTo para comprobar si la carta actual es menor que
    //otra carta dada. El criterio de ordenación es por palos (el menor es oros,
    //después copas, a continuación espadas y, finalmente, bastos) y dentro de cada
    //palo por valor (1, 2, ..., 12).
    public int compareTo(Object c) {
        Carta other = (Carta) c;
        int diferencia = other.getPalo() - this.getPalo();

        if (other.getPalo() != this.getPalo()) {
            return this.getPalo() - other.getPalo();
        } else {
            return this.getValor() - other.getValor();
        }
        return diferencia;
    }

    //Escribir un método equals para comprobar la igualdad de dos cartas. Dos
    //cartas son iguales si tienen el mismo palo y valor.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Carta carta = (Carta) o;

        if (palo != carta.palo) {
            return false;
        }
        return valor == carta.valor;
    }

    //Escribir un método sigPalo para devolver una nueva carta con el mismo valor
    //que el de la carta actual pero del palo siguiente, según la ordenación anterior y
    //sabiendo que el siguiente al palo bastos es oros.
    public Carta sigPalo() {
        int paloCarta;

        if (this.getPalo() < 3) {
            paloCarta = this.getPalo() + 1;
        } else {
            paloCarta = 0;
        }

        return new Carta(paloCarta, this.getValor());
    }

    //Escribir un método toString para transformar en String la carta actual, con el
    //siguiente formato: "valor de palo"; por ejemplo, "4 de oros" o "1 de bastos"
    //(sobrescritura del método toString de Object ).
    @Override
    public String toString() {
        String[] baraja = new String[BASTOS + 1];

        switch (palo) {
            case 0:
                return this.getValor() + " de oros.";

            case 1:
                return this.getValor() + " de copas.";

            case 2:
                return this.getValor() + " de espadas.";

            case 3:
                return this.getValor() + " de bastos.";
        }
        return "ERROR. El valor dado no es correcto.";
    }
}
