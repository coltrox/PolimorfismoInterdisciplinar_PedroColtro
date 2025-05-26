package app;

import model.geopolitica.*;
import model.revolucaofrancesa.*;
import model.macromoleculas.*;
import util.Utils;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        //Menu
        while (continuar) {
            System.out.println("\n=== MENU PRINCIPAL ==="); 
            System.out.println("Escolha a matéria:");
            System.out.println("1 - Revolução Francesa (História)");
            System.out.println("2 - Guerra Fria (Geografia)");
            System.out.println("3 - Macromoléculas (Biologia)");
            System.out.println("0 - Sair");
            int opcao = Utils.lerInt(">>> ");

            //Opções
            switch (opcao) {
                case 1:
                    menuHistoria(); 
                    break;
                case 2:
                    menuGeografia();
                    break;
                case 3:
                    menuBiologia();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }
    }
         //Menu de História
    public static void menuHistoria() {
        boolean repetir = true;
        while (repetir) {
            System.out.println("\n=== História - Revolução Francesa ===");
            System.out.println("Escolha o conteúdo: (Digite: Causa | Queda | Consequencias | Voltar)");
            String escolha = Utils.lerString(">>> ").toLowerCase();

            switch (escolha) {
                case "causa":
                    RevolucaoFrancesa causa = new Causa();
                    causa.explicar();
                    break;
                case "queda":
                    RevolucaoFrancesa queda = new QuedaBastilha();
                    queda.explicar();
                    break;
                case "consequencias":
                    RevolucaoFrancesa cons = new ConsequenciasRF();
                    cons.explicar();
                    break;
                case "voltar":
                    repetir = false;
                    break;
                default:
                    System.out.println("❌ Conteúdo inválido. Tente novamente.");
            }
        }
    }
            //Menu de geografia
    public static void menuGeografia() {
        boolean repetir = true;
        while (repetir) {
            System.out.println("\n=== Geografia - Guerra Fria ===");
            System.out.println("Escolha o conteúdo: (Digite: Causas | Blocos | Consequencias | Voltar)");
            String escolha = Utils.lerString(">>> ").toLowerCase();

            switch (escolha) {
                case "causas":
                    GuerraFria causas = new Causas();
                    causas.explicar();
                    break;
                case "blocos":
                    GuerraFria blocos = new Blocos();
                    blocos.explicar();
                    break;
                case "consequencias":
                    GuerraFria cons = new ConsequenciasGF();
                    cons.explicar();
                    break;
                case "voltar":
                    repetir = false;
                    break;
                default:
                    System.out.println("❌ Conteúdo inválido. Tente novamente.");
            }
        }
    }
            //Menu de biologia
    public static void menuBiologia() {
        boolean repetir = true;
        while (repetir) {
            System.out.println("\n=== Biologia - Macromoléculas ===");
            System.out.println("Escolha o conteúdo: (Digite: Carboidratos | Lipidios | Proteinas | Acidos | Voltar)");
            String escolha = Utils.lerString(">>> ").toLowerCase();

            switch (escolha) {
                case "carboidratos":
                    MacroMoleculas carb = new Carboidratos();
                    carb.descrever();
                    break;
                case "lipidios":
                    MacroMoleculas lip = new Lipidios();
                    lip.descrever();
                    break;
                case "proteinas":
                    MacroMoleculas prot = new Proteinas();
                    prot.descrever();
                    break;
                case "acidos":
                    MacroMoleculas acido = new AcidosNucleicos();
                    acido.descrever();
                    break;
                case "voltar":
                    repetir = false;
                    break;
                default:
                    System.out.println("❌ Conteúdo inválido. Tente novamente.");
            }
        }
    }
}
