public class Servico extends ItemPedido {
    public Servico(String descricao, double precoUnitario, int quantidade) {
        super(descricao, precoUnitario, quantidade);
    }

    @Override
    public double calcularPrecoTotal() {
        return precoUnitario * quantidade;
    }
}
