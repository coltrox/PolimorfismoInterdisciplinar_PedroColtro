package app;

// Importa todas as classes necessárias
import model.bioma.*;
import model.geometria.*;
import model.estado_materia.*;
import util.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista para armazenar todos os objetos
        List<Object> objetos = new ArrayList<>();
        String opcao;

        
        do {
            // Exibe o menu principal
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1 - Biomas (Geografia)");
            System.out.println("2 - Figuras Geométricas (Matemática)");
            System.out.println("3 - Estados da Matéria (Ciências)");
            System.out.println("0 - Sair");
            opcao = Utils.lerString("Escolha uma opção: ");

            // opção escolhida
            switch (opcao) {
                case "1":
                    // Usuário escolheu Biomas
                    Bioma bioma = escolherBioma();
                    bioma.descricao();
                    bioma.clima();
                    objetos.add(bioma); // Armazena o objeto na lista
                    break;
                case "2":
                    // Usuário escolheu Figuras Geométricas
                    FiguraGeometrica figura = escolherFigura();
                    figura.descricao();
                    System.out.println("Área: " + figura.calcularArea());
                    objetos.add(figura); // Armazena o objeto na lista
                    break;
                case "3":
                    // Usuário escolheu Estados da Matéria
                    EstadoMateria estado = escolherEstado();
                    estado.caracteristicas();
                    estado.exemplo();
                    objetos.add(estado); // Armazena o objeto na lista
                    break;
                case "0":
                    // Finaliza o programa
                    System.out.println("Saindo...");
                    break;
                default:
                    // Entrada inválida
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("0")); // Repete até o usuário escolher sair

        // Exibe os tipos dos objetos criados durante a execução
        System.out.println("\n=== Objetos Criados ===");
        objetos.forEach(obj -> System.out.println(obj.getClass().getSimpleName()));
    }

    // criar e retornar um bioma com base na entrada do usuário
    public static Bioma escolherBioma() {
        String tipo = Utils.lerString("Digite o tipo (floresta, tundra, deserto): ").toLowerCase();
        String pais = Utils.lerString("Digite o país do bioma: ");
        switch (tipo) {
            case "floresta": return new Floresta("Floresta", pais);
            case "tundra": return new Tundra("Tundra", pais);
            case "deserto": return new Deserto("Deserto", pais);
            default:
                System.out.println("Bioma inválido. Criando Floresta por padrão.");
                return new Floresta("Floresta", pais);
        }
    }

    // criar e retornar uma figura geométrica com base na entrada
    public static FiguraGeometrica escolherFigura() {
        String tipo = Utils.lerString("Digite a figura (quadrado, triangulo, circulo): ").toLowerCase();
        switch (tipo) {
            case "quadrado":
                double lado = Utils.lerDouble("Digite o lado do quadrado: ");
                return new Quadrado(lado);
            case "triangulo":
                double base = Utils.lerDouble("Digite a base: ");
                double altura = Utils.lerDouble("Digite a altura: ");
                return new Triangulo(base, altura);
            case "circulo":
                double raio = Utils.lerDouble("Digite o raio: ");
                return new Circulo(raio);
            default:
                System.out.println("Figura inválida. Criando Quadrado por padrão.");
                return new Quadrado(1);
        }
    }

    // criar e retornar um estado da matéria com base na entrada
    public static EstadoMateria escolherEstado() {
        String tipo = Utils.lerString("Digite o estado (solido, liquido, gasoso): ").toLowerCase();
        switch (tipo) {
            case "solido": return new Solido();
            case "liquido": return new Liquido();
            case "gasoso": return new Gasoso();
            default:
                System.out.println("Estado inválido. Criando Sólido por padrão.");
                return new Solido();
        }
    }
}
