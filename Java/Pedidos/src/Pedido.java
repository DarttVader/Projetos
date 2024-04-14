public abstract class Pedido {
    protected int numeroPedido;
    protected String cliente;
    protected double valorTotal;

    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.valorTotal = 0.0;
    }

    public abstract void calcularValorTotal();
}
