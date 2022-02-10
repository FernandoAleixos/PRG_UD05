package contrareloj;

//La clase ListaCorredores permite representar a un conjunto de corredores. En la lista,
//como máximo habrá 200 corredores, aunque puede haber menos de ese número.
//Se utilizará un array, llamado lista, de 200 elementos junto con una propiedad
//numCorredores que permita saber cuentos corredores hay realmente.
public class ListaCorredores {

    //Atributos
    private final int[] LISTA;
    private final int MAXCORREDORES = 200;
    private int numCorredores;

    //Construtor.
    //Crea la lista de corredores, incicialmente vacía.
    public ListaCorredores() {
        LISTA = new int[MAXCORREDORES];
    }

    // Añade un corredor al final de la lista de corredores, siempre y cuando el corredor no
    //esté ya en la lista, en cuyo caso se lanzará ElementoDuplicadoException
    public void añadir(Corredor c) throws ElementoDuplicadoExceprion {
        for () {

        }
    }

    private class ElementoDuplicadoExceprion extends Exception {
    }
}
