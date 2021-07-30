package aulas.oo.part02.construtores;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro(String marca, String modelo, Integer ano, String variante) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getVariante() {
        return variante;
    }


}
