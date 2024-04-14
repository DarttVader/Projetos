public class Arqueiro extends Personagem {
    private boolean podeEsquivar;

    public Arqueiro(String nome, int vida, int ataque, int defesa, boolean podeEsquivar) {
        super(nome, vida, ataque, defesa);
        this.podeEsquivar = podeEsquivar;
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

    public boolean isPodeEsquivar() {
        return podeEsquivar;
    }

    public void setPodeEsquivar(boolean podeEsquivar) {
        this.podeEsquivar = podeEsquivar;
    }
}
