import java.util.Scanner;

/**
  Questão 5: explicação e demonstração do uso do Scanner e do printf.

  O Scanner é uma classe do pacote java.util usada para ler dados digitados
  pelo usuário no console. Criamos um objeto Scanner associado à entrada
  padrão (System.in) e usamos métodos como nextInt(), nextDouble(),
  nextLine() e next() para ler diferentes tipos de dados de acordo com
  a necessidade (número inteiro, decimal, texto, etc.).

  O System.out.printf permite formatar a saída de dados usando
  especificadores de formato, como:
    %d -> número inteiro
    %s -> texto (String)
    %f -> número de ponto flutuante (double/float)
    %n -> quebra de linha
  Por exemplo, "%.2f" formata um valor double exibindo apenas 2 casas
  decimais, o que é muito útil para valores monetários e médias.
 */

public class Questão5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        // Exemplo de leitura de um double com Scanner
        System.out.print("Digite um valor decimal (ex: preço de um produto): ");
        double valor = sc.nextDouble();

        // Exemplo de printf exibindo o valor com 2 casas decimais
        System.out.printf("Valor informado: %.2f%n", valor);

        // Outro exemplo: calculando e exibindo um valor com 10% de imposto
        double valorComImposto = valor * 1.10;
        System.out.printf("Valor com imposto (10%%): %.2f%n", valorComImposto);
    }
}
