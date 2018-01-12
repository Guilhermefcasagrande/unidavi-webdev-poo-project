package br.edu.unidavi;

public class Carro extends Veiculo implements Acao {

    String material = "Aço";
    String desloca = "Terra";

    private String fabricante;
    private String nome;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar(){
        System.out.println("Ligando o carro...");
    }
}
