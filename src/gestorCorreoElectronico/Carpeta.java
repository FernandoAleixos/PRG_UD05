package gestorCorreoElectronico;

public class Carpeta {
    private final int MAX_MENSAJES = 100;
    private Mensaje[] listaMensajes;
    private String nombre;
    private int numMensajes;


    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.listaMensajes = new Mensaje[MAX_MENSAJES];
        this.numMensajes = 0;
    }

    public void añadir(Mensaje m) {
        for (int i = numMensajes; i < listaMensajes.length; i++) {
            if (listaMensajes[i] == null) {
                listaMensajes[i] = m;
                numMensajes++;
            }
        }
    }

    public void borrar(Mensaje m) throws ElementoNoEncontradoException{
        boolean encontrado = false;

        for (int i = 0; i < listaMensajes.length && !encontrado; i++) {
            if (listaMensajes[i] == m) {
                listaMensajes[i] = null;
                numMensajes--;
                encontrado = true;

                for (int j = numMensajes; j < listaMensajes.length - 1; j++){
                    listaMensajes[j] = listaMensajes[j + 1];

                }
            } else {
                throw new ElementoNoEncontradoException();
            }
        }
    }

    static class ElementoNoEncontradoException extends Exception {

    }

    //Método estático. Recibe dos
    //Carpetas de correo y un código de mensaje y mueve el mensaje indicado de
    //una carpeta a otra. Para ello buscará el mensaje en la carpeta origen. Si existe
    //lo eliminará y lo añadirá a la carpeta de destino. Si el mensaje indicado no está
    //en la carpeta de origen lanza ElementoNoEncontradoException .
    public static void moverMensaje(Carpeta origen, Carpeta destino) throws ElementoNoEncontradoException {
        if () {

        } else {
            throw new ElementoNoEncontradoException();
        }
    }
}
