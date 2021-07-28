package one.innovation.digital.tipos.tipagem;

public class TipagemForte {

    public static void main(String[] args) {
        String texto = "Meu texto";

        //texto = 1000;  //NOK

        Integer numero = Integer.valueOf(1024);

        numero = 512;  //OK
    }
}
