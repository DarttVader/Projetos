public class Produto {
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private Boolean desconto;
    @SuppressWarnings("unused")
    private Double preco;
    @SuppressWarnings("unused")
    private Double peso;

    public Produto(String nome, Boolean desconto, Double preco, Double peso) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
        this.peso = peso;
    }
}