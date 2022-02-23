package contrareloj;

//La clase ListaCorredores permite representar a un conjunto de corredores. En la lista,
//como máximo habrá 200 corredores, aunque puede haber menos de ese número.
//Se utilizará un array, llamado lista, de 200 elementos junto con una propiedad
//numCorredores que permita saber cuentos corredores hay realmente.
public class ListaCorredores {

    //Atributos
    private final int MAXCORREDORES = 200;
    private Corredor[] lista = new Corredor[MAXCORREDORES];
    private int numCorredores;

    //Construtor
    //Crea la lista de corredores, incicialmente vacía.
    public ListaCorredores() {
        this.lista = new Corredor[MAXCORREDORES];
        this.numCorredores = 0;
    }

    // Añade un corredor al final de la lista de corredores, siempre y cuando el corredor no
    //esté ya en la lista, en cuyo caso se lanzará ElementoDuplicadoException
    public void añadir(Corredor c) throws ElementoDuplicadoException {
        int pos;

        for (pos = 0; lista[pos] != null && pos < lista.length; pos++) {
            if (c.equals(lista[pos])) {
                throw new ElementoDuplicadoException();
            }
        }
        lista[pos] = c;
        numCorredores++;
    }

    private class ElementoDuplicadoException extends Exception {
    }

    //Inserta un corredor en la posición
    //adecuada de la lista de manera que esta se mantenga ordenada
    //crecientemente por el tiempo de llegada. Para poder realizar la inserción debe
    //averiguarse la posición que debe ocupar el nuevo elemento y, antes de
    //añadirlo al array, desplazar el elemento que ocupa esa posición y todos los
    //posteriores, una posición a la derecha.
    public void insertarOrdenado(Corredor c) {
        //suponemos que la lista esta ordenada y tenemos que insertar un corredor
        boolean encontrado = true;

        if (numCorredores == MAXCORREDORES) {//si la lista está llena el corredor no puede entrar
            System.out.print("Lo siento, la lista está llena.");

        } else if (numCorredores == 0) {//si la lista está vacía el corredor será el primero
            lista[0] = c;
            numCorredores++;

        } else {//si hay algún corredor en la lista tendremos que buscar la posición adecuada
            int pos = 0;
            while (lista[pos].getTiempo() < c.getTiempo() && !encontrado) {
                pos++;
            }
            for (int i = lista.length - 1; i > pos; i--){
                lista[i - 1] = lista[i];
            }
            lista[pos] = c;
            numCorredores++;
        }
    }

    //Quita de la lista al corredor cuyo dorsal se indica. El array debe mantenerse
    //compacto, es decir, todos los elementos posteriores al eliminado deben
    //desplazarse una posición a la izquierda. El método devuelve el Corredor quitado de la lista.
    //Si no se encuentra se lanza ElementoNoEncontradoException .
    public Corredor quitar(int dorsal) throws ElementoNoEncontradoException {
        //Hacemos un bucle para recorrer la lista de corredores para encontrar al corredor con el dorsal indicado
        Corredor c = null;
        int pos = 0;
        for (int i = 0; i < lista.length; i++) {
            //Suponemos que la lista está ordenada por lo cual al borrar el corredor desplazaremos a todos los corredores,
            //después de este, una posición a la izquierda.
            if (dorsal == lista[i].getDorsal()) {

            }
        }
    }

    class ElementoNoEncontradoException extends Exception {
    }
}
