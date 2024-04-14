import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date prazoDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, prazoDevolucao);
        emprestimos.add(emprestimo);
    }

    // Outros métodos para consulta e geração de relatórios
}
