import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizarFuncionario(int index, Funcionario funcionario) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.set(index, funcionario);
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void excluirFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.remove(index);
        }
    }
}