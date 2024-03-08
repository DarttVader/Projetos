// Implementação da classe Arqueiro
public class Arqueiro extends Personagem {
    Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(MonstroBase monstro) {
        int dano = this.ataque - monstro.defesa;
        monstro.receberDano(this, dano);
        System.out.println(nome + " atirou uma flecha em " + monstro.nome + " causando " + dano + " de dano.");
    }

    @Override
    void defender(int ataqueRecebido) {
        int danoRecebido = Math.max(0, ataqueRecebido - this.defesa);
        this.vida -= danoRecebido;
        System.out.println(nome + " esquivou-se, recebendo " + danoRecebido + " de dano.");
    }

    void esquivar() {
        System.out.println(nome + " realizou uma esquiva ágil!");
    }
}
