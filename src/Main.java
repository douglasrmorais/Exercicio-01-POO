import java.util.Scanner;

/**
 * Classe principal com um menu para executar cada questão
 * separadamente, sem precisar rodar cada classe individualmente.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Média ponderada");
            System.out.println("2 - Múltiplos de 3 e 5");
            System.out.println("3 - Números primos entre 2 e N");
            System.out.println("4 - Gráfico de barras");
            System.out.println("5 - Exemplo Scanner/printf");
            System.out.println("6 - Contador corrigido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    Questão1.executar(sc);
                    break;
                case 2:
                    Questão2.executar(sc);
                    break;
                case 3:
                    Questão3.executar(sc);
                    break;
                case 4:
                    Questão4.executar(sc);
                    break;
                case 5:
                    Questão5.executar(sc);
                    break;
                case 6:
                    Questão6.executar(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}