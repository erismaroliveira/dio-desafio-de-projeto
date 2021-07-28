package one.innovation.digital.classes.pessoa;

public class ProgramaPessoaFisica {

    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 65.4f);

        System.out.println(pessoaFisica.relatorio());
    }
}
