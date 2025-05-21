package model.estado_materia;

// representar um estado físico da matéria
public abstract class EstadoMateria {
    // Atributo comum a todos os estados: o nome do estado
    protected String nome;

    // define o nome do estado
    public EstadoMateria(String nome) {
        this.nome = nome;
    }

    // exibir as características do estado
    public abstract void caracteristicas();

    // dar um exemplo do estado
    public abstract void exemplo();
}
