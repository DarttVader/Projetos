// Classe abstrata Personagem
public abstract class Personagem {
    String nome;
    int vida;
    int ataque;
    int defesa;

    Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void atacar(MonstroBase monstro);

    abstract void defender(int ataqueRecebido);

    void imprimirStatus() {
        System.out.println(nome + " - Vida: " + vida);
    }
}
