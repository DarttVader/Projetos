import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Fábio", "fabio@example.com", "senha123", new Date());
        Usuario usuario2 = new Usuario("Rambo", "rambo@example.com", "senha456", new Date());

        usuario1.criarPostagem("Nova postagem!", new Date());
        usuario2.criarPostagem("Aoooooooooba!", new Date());

        System.out.println("Postagens de " + usuario1.getNome() + ":");
        for (Postagem postagem : usuario1.getPostagens()) {
            System.out.println("Texto: " + postagem.getTexto());
            System.out.println("Data de postagem: " + postagem.getDataPostagem());
            System.out.println("Curtidas: " + postagem.getCurtidas());
            System.out.println("Comentários: " + postagem.getComentarios());
            System.out.println();
        }

        System.out.println("Postagens de " + usuario2.getNome() + ":");
        for (Postagem postagem : usuario2.getPostagens()) {
            System.out.println("Texto: " + postagem.getTexto());
            System.out.println("Data de postagem: " + postagem.getDataPostagem());
            System.out.println("Curtidas: " + postagem.getCurtidas());
            System.out.println("Comentários: " + postagem.getComentarios());
            System.out.println();
        }
    }
}
