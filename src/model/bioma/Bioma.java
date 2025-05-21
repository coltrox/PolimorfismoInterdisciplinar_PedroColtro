package model.bioma;

// Classe abstrata que serve como modelo base para diferentes tipos de biomas
public abstract class Bioma {
    // Atributos comuns a todos os biomas
    protected String nome;
    protected String pais;

    // inicializa o nome e o país do bioma
    public Bioma(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    // Método abstrato que será implementado nas subclasses para descrever o bioma
    public abstract void descricao();

    // Método abstrato que será implementado nas subclasses para informar o clima do bioma
    public abstract void clima();
}
