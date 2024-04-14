public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Conan", 100, 20, 30, true);
        Mago mago = new Mago("Gandalf", 80, 25, 25, true);
        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 30, 20, true);

        Monstro monstro = new Monstro("Ogro", 150, 15, 10);

        guerreiro.atacar(monstro);
        monstro.defender(guerreiro.ataque);
        System.out.println("Vida do monstro após o ataque do guerreiro: " + monstro.vida);

        mago.atacar(monstro);
        monstro.defender(mago.ataque);
        System.out.println("Vida do monstro após o ataque do mago: " + monstro.vida);

        arqueiro.atacar(monstro);
        monstro.defender(arqueiro.ataque);
        System.out.println("Vida do monstro após o ataque do arqueiro: " + monstro.vida);
    }
}
