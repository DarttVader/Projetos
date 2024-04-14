public class Guerreiro extends Personagem {
    private boolean podePular;

    public Guerreiro(String nome, int vida, int ataque, int defesa, boolean podePular) {
        super(nome, vida, ataque, defesa);
        this.podePular = podePular;
    }

    @Override
    public void atacar(MonstroBase monstro) {
        int dano = ataque - monstro.defesa;
        monstro.receberDano(this);
    }

    @Override
    public void atacar(Monstro monstro) {
        
    }

    @Override
    public void defender(int ataqueRecebido) {
        int danoReal = ataqueRecebido - defesa;
        vida -= danoReal;
    }

    public boolean isPodePular() {
        return podePular;
    }

    public void setPodePular(boolean podePular) {
        this.podePular = podePular;
    }

    // Getters e Setters
}
