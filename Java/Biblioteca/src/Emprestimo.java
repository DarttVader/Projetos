import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date prazoDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date prazoDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(Date prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
}
