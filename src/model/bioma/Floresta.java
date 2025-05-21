package model.bioma;

public class Floresta extends Bioma {

    public Floresta(String nome, String pais) {
        super(nome, pais);
    }

    @Override
    public void descricao() {
        System.out.println("Bioma Floresta: Alta biodiversidade, árvores altas.");
    }

    @Override
    public void clima() {
        System.out.println("Clima: Quente e úmido.");
    }
}
