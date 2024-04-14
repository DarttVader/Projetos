public abstract class ItemPedido {
    protected String descricao;
    protected double precoUnitario;
    protected int quantidade;

    public ItemPedido(String descricao, double precoUnitario, int quantidade) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public abstract double calcularPrecoTotal();

}
