package gestorCorreoElectronico;

public class Carpeta {
    private final int MAX_MENSAJES = 100;
    private Mensaje[] listaMensajes;
    private String nombre;
    private int numMensajes;
    private int ultimaPosDisponible;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.listaMensajes = new Mensaje[MAX_MENSAJES];
        this.ultimaPosDisponible = 0;
    }

    public void añadir(Mensaje m) {
        for (int i = ultimaPosDisponible; i < listaMensajes.length; i++) {
            if (listaMensajes[i] == null) {
                listaMensajes[i] = m;
                numMensajes++;
                ultimaPosDisponible = i + 1;
            }
        }
    }

    public void borrar(Mensaje m) throws ElementoNoEncontradoException{
        boolean encontrado = false;

        for (int i = 0; i < listaMensajes.length && !encontrado; i++) {
            if (listaMensajes[i] == m) {
                listaMensajes[i] = null;
                numMensajes--;
                ultimaPosDisponible = i;
                encontrado = true;

                int pos = 0;

                while (listaMensajes[pos] != null && !encontrado) {
                    pos++;
                }
                for (int j = listaMensajes.length - 1; j > pos; j--){
                    listaMensajes[j - 1] = listaMensajes[j];
                }
            } else {
                throw new ElementoNoEncontradoException();
            }
        }
    }

    private class ElementoNoEncontradoException extends Exception {
    }


}
