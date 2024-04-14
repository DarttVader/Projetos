public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline(1, "Cliente Online", 10.0);

        Pedido pedidoPresencial = new PedidoPresencial(2, "Cliente Presencial", 5.0);

        ItemPedido produto1 = new Produto("Produto 1", 20.0, 2);
        pedidoOnline.valorTotal += produto1.calcularPrecoTotal();

        ItemPedido servico1 = new Servico("Serviço 1", 15.0, 1);
        pedidoOnline.valorTotal += servico1.calcularPrecoTotal();

        ItemPedido produto2 = new Produto("Produto 2", 30.0, 1);
        pedidoPresencial.valorTotal += produto2.calcularPrecoTotal();

        ItemPedido servico2 = new Servico("Serviço 2", 25.0, 1);
        pedidoPresencial.valorTotal += servico2.calcularPrecoTotal();

        pedidoOnline.calcularValorTotal();
        pedidoPresencial.calcularValorTotal();

        System.out.println("Valor total do Pedido Online: R$" + pedidoOnline.valorTotal);
        System.out.println("Valor total do Pedido Presencial: R$" + pedidoPresencial.valorTotal);
    }
}
