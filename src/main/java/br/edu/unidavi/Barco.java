package br.edu.unidavi;

public class Barco extends Veiculo implements Acao {

    String volante = "Azul";

    String material = "Madeira";
    String desloca = "Água";

    private String marca;
    private String nome;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar(){
        System.out.println("Ligando....");
    }
}
