package juegoDeCartas;

public class Carta {
    public static final int OROS = 0;
    public static final int COPAS = 1;
    public static final int ESPADAS = 2;
    public static final int BASTOS = 3;

    private int palo;
    private int valor;

    public Carta() {
        this.palo = (int)((Math.random() * 4) + 1);
        this.valor = (int)((Math.random() * 12) + 1);
    }
}
