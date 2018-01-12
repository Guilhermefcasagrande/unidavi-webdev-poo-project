package br.edu.unidavi;

public class Moto extends Veiculo implements Acao{

    String material = "Aço";
    String desloca = "terra";
    String volanet = "não";

    private String tipo;
    private String modelo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar(){
        System.out.println("Ligando a moto");
    }
}
