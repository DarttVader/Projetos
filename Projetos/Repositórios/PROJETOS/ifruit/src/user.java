import java.util.ArrayList;

public class User {
    private String nome;
    private String email;
    private Integer idade;
    private Carrinho carrinho;
    private Double precoBruto;
    private Double taxa;
    private Double precoTotal;
    private ArrayList<Produto> listaProd;

    public User(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.carrinho = new Carrinho();
        this.precoBruto = 0.0;
        this.taxa = 0.0;
        this.precoTotal = 0.0;
        this.listaProd = new ArrayList<>();
    }

    public void Pagar() {}

    public void FecharCompra() {}

    public void MostraPreco() {}

    public void ListarProd() {}

    public void CalcDescont() {}

    public Double GetPreco() {
        return precoTotal;
    }

    public Double GetPeso() {
        return pesoTotal;
    }
}