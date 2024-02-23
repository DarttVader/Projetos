public class Produto {
    private String nome;
    private Boolean desconto;
    private Double preco;
    private Double peso;

    public Produto(String nome, Boolean desconto, Double preco, Double peso) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
        this.peso = peso;
    }
}