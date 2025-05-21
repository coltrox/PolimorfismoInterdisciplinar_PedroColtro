package model.bioma;

// Subclasse de Bioma que representa o bioma Tundra
public class Tundra extends Bioma {

    // chama o construtor da superclasse
    public Tundra(String nome, String pais) {
        super(nome, pais);
    }

    // Implementação específica da descrição da Tundra
    @Override
    public void descricao() {
        System.out.println("Bioma Tundra: Vegetação rasteira, clima extremamente frio.");
    }

    // Clima característico da Tundra
    @Override
    public void clima() {
        System.out.println("Clima: Polar.");
    }
}
