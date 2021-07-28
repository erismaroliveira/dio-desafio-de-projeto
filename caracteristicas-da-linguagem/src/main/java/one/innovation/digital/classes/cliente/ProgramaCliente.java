package one.innovation.digital.classes.cliente;

public class ProgramaCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio());  //ERROR

    }
}
