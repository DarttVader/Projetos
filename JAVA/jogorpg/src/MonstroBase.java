// Classe abstrata MonstroBase
public abstract class MonstroBase {
    String nome;
    int vida;
    int ataque;
    int defesa;

    MonstroBase(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void receberDano(Personagem personagem, int dano);

    abstract void defender(int ataqueRecebido);

    void imprimirStatus() {
        System.out.println(nome + " - Vida: " + vida);
    }
}
