package model.bioma;

public class Tundra extends Bioma {

    public Tundra(String nome, String pais) {
        super(nome, pais);
    }

    @Override
    public void descricao() {
        System.out.println("Bioma Tundra: Vegetação rasteira, clima extremamente frio.");
    }

    @Override
    public void clima() {
        System.out.println("Clima: Polar.");
    }
}
