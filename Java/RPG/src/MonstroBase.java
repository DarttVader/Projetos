public abstract class MonstroBase {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public MonstroBase(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract void receberDano(Personagem personagem);

    public abstract void defender(int ataqueRecebido);

    // Getters e Setters
}
