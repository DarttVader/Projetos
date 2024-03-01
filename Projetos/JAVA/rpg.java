abstract class Personagem {
    String nome;
    int vida;
    int ataque;
    int defesa;

    Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void atacar(Monstro monstro);

    abstract void defender(int ataqueRecebido);
}

abstract class Monstro {
    String nome;
    int vida;
    int ataque;
    int defesa;

    Monstro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void receberDano(Personagem personagem, int dano);

    abstract void defender(int ataqueRecebido);
}

class Guerreiro extends Personagem {
    Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
        int dano = this.ataque - monstro.defesa;
        monstro.receberDano(this, dano);
    }

    @Override
    void defender(int ataqueRecebido) {
        this.vida -= Math.max(0, ataqueRecebido - this.defesa);
    }

    void pular() {
    }
}

class Mago extends Personagem {
    Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
    }

    @Override
    void defender(int ataqueRecebido) {
    }

    void usarHabilidadeMagica() {
    }
}

class Arqueiro extends Personagem {
    Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
    }

    @Override
    void defender(int ataqueRecebido) {
    }

    void esquivar() {
    }
}
