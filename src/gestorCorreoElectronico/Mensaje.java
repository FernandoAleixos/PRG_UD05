package gestorCorreoElectronico;

import java.util.Objects;

public class Mensaje {

    //Atributos
    private int codigo;
    private String emisor;
    private String destinatario;
    private String asunto;
    private String texto;
    private static int sigNumero = 1;

    //Constructores
    public Mensaje(String emisor, String destinatario, String asunto, String texto) {
        this.codigo = sigNumero++;
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.texto = texto;
    }

    //No se pide
    public Mensaje(int codigo, String emisor, String destinatario, String asunto, String texto) {
        this.codigo = codigo;
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.texto = texto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static int getSigNumero() {
        return sigNumero;
    }

    public static void setSigNumero(int sigNumero) {
        Mensaje.sigNumero = sigNumero;
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

    /*public static boolean validarEMail(String email) {


        return ;
    }*/

    @Override
    public String toString() {
        return "Mensaje{" +
                "codigo=" + codigo +
                ", emisor='" + emisor + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", asunto='" + asunto + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
}
