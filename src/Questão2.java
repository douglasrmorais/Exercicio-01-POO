import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        boolean mult3 = numero % 3 == 0;
        boolean mult5 = numero % 5 == 0;

        if (mult3 && mult5) {
            System.out.println("Múltiplo de ambos");
        } else if (mult3) {
            System.out.println("Múltiplo de 3");
        } else if (mult5) {
            System.out.println("Múltiplo de 5");
        } else {
            System.out.println("Não é múltiplo de 3 nem de 5");
        }
    }
}
