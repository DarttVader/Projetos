// Implementação de uma classe de exemplo para testar o jogo
public class RPGGame {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guerreiro1", 100, 20, 30);
        Mago mago = new Mago("Mago1", 80, 25, 25);
        Arqueiro arqueiro = new Arqueiro("Arqueiro1", 90, 30, 20);

        InimigoSimples monstro = new InimigoSimples("Monstro1", 50, 15, 10);

        guerreiro.atacar(monstro);
        mago.usarHabilidadeMagica();
        arqueiro.atacar(monstro);

        monstro.imprimirStatus();
    }
}
