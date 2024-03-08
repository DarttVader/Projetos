// Nova classe de monstro concreta
public class InimigoSimples extends MonstroBase {
    InimigoSimples(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void receberDano(Personagem personagem, int dano) {
        this.vida -= Math.max(0, dano - this.defesa);
        System.out.println(nome + " recebeu " + dano + " de dano de " + personagem.nome);
    }

    @Override
    void defender(int ataqueRecebido) {
        // Implementação da defesa do monstro (opcional)
    }
}
