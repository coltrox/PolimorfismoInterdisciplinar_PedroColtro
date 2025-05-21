package model.bioma;

// Subclasse de Bioma que representa o bioma Floresta
public class Floresta extends Bioma {

    // chama o construtor da superclasse passando nome e país
    public Floresta(String nome, String pais) {
        super(nome, pais);
    }

    // Implementação específica da descrição da Floresta
    @Override
    public void descricao() {
        System.out.println("Bioma Floresta: Alta biodiversidade, árvores altas.");
    }

    // Implementação do clima típico da Floresta
    @Override
    public void clima() {
        System.out.println("Clima: Quente e úmido.");
    }
}
