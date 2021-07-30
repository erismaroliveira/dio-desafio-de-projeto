package aulas.oo.part01.paradigma;

public class Pessoa {

    private String nome = "Erismar";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome() {
        return "Olá, meu nome é " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
