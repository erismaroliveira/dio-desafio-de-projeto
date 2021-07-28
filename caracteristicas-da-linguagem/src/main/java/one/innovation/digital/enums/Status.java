package one.innovation.digital.enums;

public enum Status {

    OPEN(1, "Aberto");
    //CLOSE(2, "Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
