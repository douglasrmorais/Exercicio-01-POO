import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3 (peso 2): ");
        double nota3 = sc.nextDouble();

        // Soma dos pesos = 1 + 1 + 2 = 4
        double media = (nota1 + nota2 + (nota3 * 2)) / 4.0;

        System.out.printf("%nAluno: %s%n", nome);
        System.out.printf("Média ponderada: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
