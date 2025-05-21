package model.bioma;

// Subclasse de Bioma que representa o bioma Deserto
public class Deserto extends Bioma {

    // chama o construtor da superclasse
    public Deserto(String nome, String pais) {
        super(nome, pais);
    }

    // Implementação específica da descrição do Deserto
    @Override
    public void descricao() {
        System.out.println("Bioma Deserto: Pouca vegetação, clima árido.");
    }

    // Clima típico do Deserto
    @Override
    public void clima() {
        System.out.println("Clima: Quente e seco.");
    }
}
