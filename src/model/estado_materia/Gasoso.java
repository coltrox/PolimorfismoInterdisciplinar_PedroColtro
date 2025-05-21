package model.estado_materia;

public class Gasoso extends EstadoMateria {

    public Gasoso() {
        super("Gasoso");
    }

    @Override
    public void caracteristicas() {
        System.out.println("Estado Gasoso: Volume e forma variáveis.");
    }

    @Override
    public void exemplo() {
        System.out.println("Exemplo: Oxigênio.");
    }
}
