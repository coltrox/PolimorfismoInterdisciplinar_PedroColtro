package model.estado_materia;

public abstract class EstadoMateria {
    protected String nome;

    public EstadoMateria(String nome) {
        this.nome = nome;
    }

    public abstract void caracteristicas();
    public abstract void exemplo();
}
