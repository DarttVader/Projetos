public class PedidoPresencial extends Pedido {
    private double desconto;

    public PedidoPresencial(int numeroPedido, String cliente, double desconto) {
        super(numeroPedido, cliente);
        this.desconto = desconto;
    }

    @Override
    public void calcularValorTotal() {
        valorTotal -= desconto;
    }
}
