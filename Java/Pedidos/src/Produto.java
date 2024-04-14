public class Produto extends ItemPedido {
    public Produto(String descricao, double precoUnitario, int quantidade) {
        super(descricao, precoUnitario, quantidade);
    }

    @Override
    public double calcularPrecoTotal() {
        return precoUnitario * quantidade;
    }
}
