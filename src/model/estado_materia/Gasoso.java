package model.estado_materia;

// Classe que representa o estado gasoso da matéria
public class Gasoso extends EstadoMateria {

    // Construtor chama a superclasse com o nome "Gasoso"
    public Gasoso() {
        super("Gasoso");
    }

    // Implementação das características do estado gasoso
    @Override
    public void caracteristicas() {
        System.out.println("Estado Gasoso: Volume e forma variáveis.");
    }

    // Implementação de exemplo do estado gasoso
    @Override
    public void exemplo() {
        System.out.println("Exemplo: Oxigênio.");
    }
}
