public class SistemaPdv {
    public static void main(String[] args) {

        //Classe produto
        class produto {

            //Atributos da Classe produto
            String nome;
            double preco;
            String descricao;

            //Construtor da classe produto
            public produto(String nome, double preco, String descricao) {
                this.nome = nome;
                this.preco = preco;
                this.descricao = descricao;
            }

            //Método para mostrar os atributos da classe produto
            void mostrarProduto() {
                IO.println("Nome do produto: " + nome);
                IO.println("Preço do produto: " + preco);
                IO.println("Descrição do produto: " + descricao);
            }

            //Métodos com retorno para acessar os atributos da classe produto
            public String getNome() {
                return nome;
            }

            public double getPreco() {
                return preco;
            }

            public String getDescricao() {
                return descricao;
            }

        }

        //Criando um objeto da classe produto e usando os métodos para acessar os atributos
        produto produto1 = new produto("Camiseta", 29.99, "Camiseta de algodão tamanho M");
        produto1.mostrarProduto();
        IO.println(produto1.getNome());
        IO.println(produto1.getPreco());
        IO.println(produto1.getDescricao());

    }
}
