package one.innovation.digital.classes.pessoa;

import one.innovation.digital.classes.cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        System.out.println(cliente.relatorio());  //OK
    }
}
