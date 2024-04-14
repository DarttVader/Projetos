public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract void atacar(MonstroBase monstro);

    public abstract void atacar(Monstro monstro);

    public abstract void defender(int ataqueRecebido);
}
