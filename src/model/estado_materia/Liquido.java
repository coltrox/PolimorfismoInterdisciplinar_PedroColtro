package model.estado_materia;

// Classe que representa o estado líquido da matéria
public class Liquido extends EstadoMateria {

    // Construtor chama a superclasse com o nome "Líquido"
    public Liquido() {
        super("Líquido");
    }

    // Implementação das características do estado líquido
    @Override
    public void caracteristicas() {
        System.out.println("Estado Líquido: Volume definido, forma variável.");
    }

    // Implementação de exemplo do estado líquido
    @Override
    public void exemplo() {
        System.out.println("Exemplo: Água.");
    }
}
