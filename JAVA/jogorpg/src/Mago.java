// Implementação da classe Mago
public class Mago extends Personagem {
    Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(MonstroBase monstro) {
        int dano = this.ataque - monstro.defesa;
        monstro.receberDano(this, dano);
        System.out.println(nome + " lançou um feitiço em " + monstro.nome + " causando " + dano + " de dano.");
    }

    @Override
    void defender(int ataqueRecebido) {
        int danoRecebido = Math.max(0, ataqueRecebido - this.defesa);
        this.vida -= danoRecebido;
        System.out.println(nome + " conjurou uma barreira mágica, recebendo " + danoRecebido + " de dano.");
    }

    void usarHabilidadeMagica() {
        System.out.println(nome + " usou uma habilidade mágica especial!");
    }
}
