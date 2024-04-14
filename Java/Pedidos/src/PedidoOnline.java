public class PedidoOnline extends Pedido {
    private double taxaEntrega;

    public PedidoOnline(int numeroPedido, String cliente, double taxaEntrega) {
        super(numeroPedido, cliente);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public void calcularValorTotal() {
        valorTotal += taxaEntrega;
    }
}
