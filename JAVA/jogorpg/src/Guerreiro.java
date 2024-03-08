// Implementação da classe Guerreiro
public class Guerreiro extends Personagem {
    Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(MonstroBase monstro) {
        int dano = this.ataque - monstro.defesa;
        monstro.receberDano(this, dano);
        System.out.println(nome + " atacou " + monstro.nome + " causando " + dano + " de dano.");
    }

    @Override
    void defender(int ataqueRecebido) {
        int danoRecebido = Math.max(0, ataqueRecebido - this.defesa);
        this.vida -= danoRecebido;
        System.out.println(nome + " defendeu-se, recebendo " + danoRecebido + " de dano.");
    }

    void pular() {
        System.out.println(nome + " pulou para evitar o ataque.");
    }
}
