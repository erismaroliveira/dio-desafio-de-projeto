package one.innovation.digital.tipos.tipagem;

public class TipoInferido {

    public static void main(String[] args) {
        var numero = Integer.valueOf("123456");
        var texto = "O número é : ";

        System.out.println(texto + numero);
    }
}
