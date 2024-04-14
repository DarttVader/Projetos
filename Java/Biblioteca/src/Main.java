import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Aventuras de Alice no País das Maravilhas", "Lewis Carroll", "Editora X", 1865, "9780000000001");
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", "Editora Y", 1605, "9780000000002");

        Usuario usuario1 = new Usuario("João", "Rua A, 123", "123456789", "joao@example.com");
        Usuario usuario2 = new Usuario("Maria", "Rua B, 456", "987654321", "maria@example.com");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        Date dataEmprestimo = new Date();
        Date prazoDevolucao = new Date(dataEmprestimo.getTime() + (7 * 24 * 60 * 60 * 1000));
        biblioteca.registrarEmprestimo(livro1, usuario1, dataEmprestimo, prazoDevolucao);

    }
}
