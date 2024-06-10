public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, double salario, String linguagem) {
        super(nome, "Programador", salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", salario=" + getSalario() +
                ", linguagem='" + linguagem + '\'' +
                '}';
    }
}