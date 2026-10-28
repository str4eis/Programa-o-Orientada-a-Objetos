public class Artesao {
    String nome;
    String cidade;
    String tecnica;
    double precoPecaMedia;  

    public Artesao(String nome, String cidade, String tecnica, double precoPecaMedia) {
        this.nome = nome;
        this.cidade = cidade;
        this.tecnica = tecnica;
        this.precoPecaMedia = precoPecaMedia;
    }

    void exibirPerfil() {
        IO.println("Nome do artesão: " + nome);
        IO.println("Cidade do artesão: " + cidade);
        IO.println("Técnica utilizada: " + tecnica);
        IO.println("Preço médio das peças: " + precoPecaMedia);
    }

    void exibirPerfil(boolean detalhado) {
        if (detalhado) {
            IO.println("Nome do artesão: " + nome);
            IO.println("Cidade do artesão: " + cidade);
            IO.println("Técnica utilizada: " + tecnica);
            IO.println("Preço médio das peças: " + precoPecaMedia);
            IO.println("Detalhes adicionais.");
        } else {
            exibirPerfil();
        }
    }

    void calcularFaturamento(int quantidadeVendas) {
        double faturamento = quantidadeVendas * precoPecaMedia;
        IO.println("Faturamento estimado com " + quantidadeVendas + " vendas: " + faturamento);
    }

    record Produto(String nome, double preco, int quantidade, String descricao, Artesao artesao) {
        void exibirProduto() {
            IO.println("Nome do produto: " + nome);
            IO.println("Preço do produto: " + preco);
            IO.println("Quantidade disponível: " + quantidade);
            IO.println("Descrição do produto: " + descricao);
            IO.println("Artesão responsável: " + artesao.nome);
        }
    }

}

void main() {
    Artesao artesao1 = new Artesao("João", "São Paulo", "Cerâmica", 50.0);
    Artesao artesao2 = new Artesao("João", "São Paulo", "Cerâmica", 50.0);
    Artesao artesao3 = new Artesao("Carlos", "Belo Horizonte", "Escultura", 200.0);
    Artesao.Produto produto1 = new Artesao.Produto("Vaso", 50.0, 10, "Vaso de cerâmica", artesao1);
    Artesao.Produto produto2 = new Artesao.Produto("Vaso", 50.0, 10, "Vaso de cerâmica", artesao1);
    
    boolean SaoIguais = (artesao1 == artesao2); // false: compara referências de memória (endereços diferentes)
    boolean ConteudoIguais = (artesao1.equals(artesao2)); // false: sem override de equals, também compara memória
    IO.println("artesao1 == artesao2: " + SaoIguais);
    IO.println("artesao1.equals(artesao2): " + ConteudoIguais);
    // artesao1.calcularFaturamento(10);
    // artesao2.calcularFaturamento(5);
    // artesao3.calcularFaturamento(8);
    // artesao1.exibirPerfil();
    // artesao2.exibirPerfil();
    // artesao3.exibirPerfil();
    // artesao1.exibirPerfil(true);
    // artesao2.exibirPerfil(false);
    // artesao3.exibirPerfil(true);
}