package br.edu.unidavi;

public class Veiculo {

    private String motor;
    private String roda;
    private String combustivel;

    String volanet = "Volante preto";

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getVolanet() {
        return volanet;
    }

    public void setVolanet(String volanet) {
        this.volanet = volanet;
    }
}
