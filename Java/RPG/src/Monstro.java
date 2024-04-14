public class Monstro extends MonstroBase {
    public Monstro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void receberDano(Personagem personagem) {
        int dano = personagem.ataque - defesa;
        vida -= dano;
    }

    @Override
    public void defender(int ataqueRecebido) {
        int danoReal = ataqueRecebido - defesa;
        vida -= danoReal;
    }
}
