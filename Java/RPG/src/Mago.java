public class Mago extends Personagem {
    private boolean soltaHabilidadesMagicas;

    public Mago(String nome, int vida, int ataque, int defesa, boolean soltaHabilidadesMagicas) {
        super(nome, vida, ataque, defesa);
        this.soltaHabilidadesMagicas = soltaHabilidadesMagicas;
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

    public boolean isSoltaHabilidadesMagicas() {
        return soltaHabilidadesMagicas;
    }

    public void setSoltaHabilidadesMagicas(boolean soltaHabilidadesMagicas) {
        this.soltaHabilidadesMagicas = soltaHabilidadesMagicas;
    }

    // Getters e Setters
}
