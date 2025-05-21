package model.estado_materia;

// Classe que representa o estado sólido da matéria
public class Solido extends EstadoMateria {

    // chama a superclasse com o nome "Sólido"
    public Solido() {
        super("Sólido");
    }

    // Implementação das características do estado sólido
    @Override
    public void caracteristicas() {
        System.out.println("Estado Sólido: Forma e volume definidos.");
    }

    // Implementação de exemplo do estado sólido
    @Override
    public void exemplo() {
        System.out.println("Exemplo: Pedra.");
    }
}
