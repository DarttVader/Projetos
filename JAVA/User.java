import java.util.ArrayList;

public class User {
    private Double pesoTotal;
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private String email;
    @SuppressWarnings("unused")
    private Integer idade;
    @SuppressWarnings("unused")
    private Carrinho carrinho;
    @SuppressWarnings("unused")
    private Double precoBruto;
    @SuppressWarnings("unused")
    private Double taxa;
    private Double precoTotal;
    @SuppressWarnings("unused")
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