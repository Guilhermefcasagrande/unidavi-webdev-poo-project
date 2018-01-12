package br.edu.unidavi;

public class TestaVeiculo {

    public static void main(String[] args) {

        Barco b = new Barco();
        b.setCombustivel("Gasolina azul");
        b.setMotor("2 tempos");
        b.setRoda("Indisponível");
        b.setMarca("Alguma marca de barco");
        b.setNome("Bateira 2000");

        System.out.println("Marca:" +b.getMarca()+ "\n " +
                "Nome: "+b.getNome()+"\n" +
                "Motor: "+b.getMotor()+"\n" +
                "Roda: "+b.getRoda()+"\n" +
                "combustivel: "+b.getCombustivel()+"\n" +
                "Material: "+b.material+"\n" +
                "Desloca: "+b.desloca+"\n" +
                "Volante: "+b.volanet);
        b.ligar();

        System.out.println("------------------------------");

        Carro c = new Carro();
        c.setCombustivel("flex");
        c.setMotor("1.0");
        c.setRoda("Aro 13");
        c.setFabricante("GM");
        c.setNome("Corsa");

        System.out.println("Fabricante: "+c.getFabricante()+"\n" +
                "Nome :"+c.getNome()+"\n" +
                "Motor :"+c.getMotor()+"\n" +
                "Roda: "+c.getRoda()+"\n" +
                "combustivel :"+c.getCombustivel()+"\n" +
                "Material :"+c.material+"\n" +
                "Desloca :"+c.desloca+"\n" +
                "Volante :"+c.volanet);

        c.ligar();

        System.out.println("-----------------------------");

        Moto m = new Moto();
        m.setCombustivel("Gasolina");
        m.setMotor("450cc");
        m.setRoda("aro 21");
        m.setTipo("off road");
        m.setModelo("KX 450 F");

        System.out.println("Combustivel: "+m.getCombustivel()+"\n" +
                "Motor: "+m.getMotor()+"\n" +
                "Roda: "+m.getRoda()+"\n" +
                "Tipo: "+m.getTipo()+"\n" +
                "Modelo: "+m.getModelo()+"\n" +
                "Material: "+m.material+"\n" +
                "Desloca: "+m.desloca+"\n" +
                "Volante: "+m.volanet);

        m.ligar();
    }
}
