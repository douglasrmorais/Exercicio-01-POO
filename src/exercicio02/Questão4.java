package exercicio02;

public class Questão4 {

    private int numero;
    private String titular;
    private float saldo;

    public Questão4(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0f;
    }

        // Sacar
        public void sacar(float valor) {
            if (valor > 10000) {
                System.out.println("Erro: Não é permitido sacar mais de R$ 10.000 por operação.");
            } else if (valor <= 0) {
                System.out.println("Erro: O valor do saque deve ser maior que zero.");
            } else if (valor > this.saldo) {
                System.out.println("Erro: Saldo insuficiente.");
            } else {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            }
        }

        // Depositar
        public void depositar(float valor) {
            if (valor <= 0) {
                System.out.println("Erro: O valor do depósito deve ser positivo.");
            } else if (valor > 10000) {
                System.out.println("Erro: O valor do depósito não pode superar R$ 10.000 por operação.");
            } else {
                this.saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            }
        }

        // Consultar saldo
        public float consultarSaldo() {
            return this.saldo;
        }

        // Getters e Setters (opcionais, mas boas práticas em POO)
        public int getNumero() {
            return numero;
        }

        public String getTitular() {
            return titular;
        }

}
