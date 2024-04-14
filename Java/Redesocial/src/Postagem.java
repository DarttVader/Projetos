import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
    private String texto;
    private Date dataPostagem;
    private int curtidas;
    private List<String> comentarios;

    public Postagem(String texto, Date dataPostagem) {
        this.texto = texto;
        this.dataPostagem = dataPostagem;
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    public void adicionarCurtida() {
        curtidas++;
    }

    public void adicionarComentario(String comentario) {
        comentarios.add(comentario);
    }

    // Getters e Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
