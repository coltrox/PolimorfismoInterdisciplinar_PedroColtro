package model.estado_materia;

public class Solido extends EstadoMateria {

    public Solido() {
        super("Sólido");
    }

    @Override
    public void caracteristicas() {
        System.out.println("Estado Sólido: Forma e volume definidos.");
    }

    @Override
    public void exemplo() {
        System.out.println("Exemplo: Pedra.");
    }
}
