import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00", "01/01/1990", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", "15/05/1985", "Rua B, 456");

        List<String> pratosPedido1 = new ArrayList<>();
        pratosPedido1.add("Pizza");
        pratosPedido1.add("Refrigerante");
        Pedido pedido1 = new Pedido(new Date(), pratosPedido1, 35.0);

        List<String> pratosPedido2 = new ArrayList<>();
        pratosPedido2.add("Hambúrguer");
        pratosPedido2.add("Batata frita");
        Pedido pedido2 = new Pedido(new Date(), pratosPedido2, 25.0);

        Mesa mesa1 = new Mesa(1, 4, false);
        Mesa mesa2 = new Mesa(2, 6, true);

        System.out.println("Cliente 1:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println();

        System.out.println("Cliente 2:");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("CPF: " + cliente2.getCpf());
        System.out.println("Endereço: " + cliente2.getEndereco());
        System.out.println();

        System.out.println("Pedido 1:");
        System.out.println("Data do pedido: " + pedido1.getDataPedido());
        System.out.println("Pratos: " + pedido1.getPratos());
        System.out.println("Valor total: R$" + pedido1.getValorTotal());
        System.out.println();

        System.out.println("Pedido 2:");
        System.out.println("Data do pedido: " + pedido2.getDataPedido());
        System.out.println("Pratos: " + pedido2.getPratos());
        System.out.println("Valor total: R$" + pedido2.getValorTotal());
        System.out.println();

        System.out.println("Mesa 1:");
        System.out.println("Número: " + mesa1.getNumeroMesa());
        System.out.println("Quantidade de lugares: " + mesa1.getQuantidadeLugares());
        System.out.println("Ocupada: " + mesa1.isOcupada());
        System.out.println();

        System.out.println("Mesa 2:");
        System.out.println("Número: " + mesa2.getNumeroMesa());
        System.out.println("Quantidade de lugares: " + mesa2.getQuantidadeLugares());
        System.out.println("Ocupada: " + mesa2.isOcupada());
        System.out.println();
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;

    public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

class Pedido {
    private Date dataPedido;
    private List<String> pratos;
    private double valorTotal;

    public Pedido(Date dataPedido, List<String> pratos, double valorTotal) {
        this.dataPedido = dataPedido;
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<String> getPratos() {
        return pratos;
    }

    public void setPratos(List<String> pratos) {
        this.pratos = pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

class Mesa {
    private int numeroMesa;
    private int quantidadeLugares;
    private boolean ocupada;

    public Mesa(int numeroMesa, int quantidadeLugares, boolean ocupada) {
        this.numeroMesa = numeroMesa;
        this.quantidadeLugares = quantidadeLugares;
        this.ocupada = ocupada;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
