package model.estado_materia;

public class Liquido extends EstadoMateria {

    public Liquido() {
        super("Líquido");
    }

    @Override
    public void caracteristicas() {
        System.out.println("Estado Líquido: Volume definido, forma variável.");
    }

    @Override
    public void exemplo() {
        System.out.println("Exemplo: Água.");
    }
}
