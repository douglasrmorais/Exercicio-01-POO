package exercicio02;


    public class Questão3 {

        private int codigo;
        private String nome;
        private double preco;
        private int estoque;

        public Questão3(int codigo, String nome, double preco, int estoque) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getEstoque() {
            return estoque;
        }

        public void setPreco(double preco) {
            if(preco >= 0) {
                this.preco = preco;
            }else{
                System.out.println("Erro! O preço não pode ser negativo.");
            }
        }

        public void exibirInfo() {
            System.out.println("--- Informações do Produto ---");
            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Estoque: " + estoque + " unidades");
        }

        public static void main(String[] args){
            Questão3 q = new Questão3(1,"Teclado", 150.0, 10);
            q.exibirInfo();
        }
    }

