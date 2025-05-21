package model.bioma;

public class Deserto extends Bioma {

    public Deserto(String nome, String pais) {
        super(nome, pais);
    }

    @Override
    public void descricao() {
        System.out.println("Bioma Deserto: Pouca vegetação, clima árido.");
    }

    @Override
    public void clima() {
        System.out.println("Clima: Quente e seco.");
    }
}
