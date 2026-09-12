import java.util.Scanner;

/**
  Questão 6: correção do código com erros de sintaxe e lógica.

  Erros encontrados no código original:

  1) ERRO DE SINTAXE: o método main estava declarado como
     "public static void main(String args)" — faltavam os colchetes [].
     O correto é "public static void main(String[] args)", pois o main
     recebe um vetor (array) de Strings, não uma única String.

  2) ERRO DE SINTAXE: faltava o ponto e vírgula (;) ao final do comando
     System.out.println("Contador: " + contador)
     Todo comando em Java deve terminar com ";".

  3) ERRO DE LÓGICA: a variável "contador" nunca era incrementada dentro
     do laço while. Como a condição era "contador <= 5" e o valor de
     contador permanecia sempre 0, o laço nunca terminava (loop infinito).
     A correção adiciona "contador++;" ao final do corpo do laço.
 */

public class Questão6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
