package gestorCorreoElectronico;

import java.util.Objects;

public class Mensaje {

    //Atributos
    private int codigo;
    private String emisor;
    private String destinatario;
    private String asunto;
    private String texto;


    //Constructores
    public Mensaje(String emisor, String destinatario, String asunto, String texto) {
        this.codigo = (int) (Math.random() + 1);
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.texto = texto;
    }

    public Mensaje(int codigo, String emisor, String destinatario, String asunto, String texto) {
        this.codigo = codigo;
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.texto = texto;
    }

    //Metodos
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mensaje mensaje = (Mensaje) o;
        return codigo == mensaje.codigo;
    }

    public static boolean validarEMail(String email) {


        return ;
    }
}
