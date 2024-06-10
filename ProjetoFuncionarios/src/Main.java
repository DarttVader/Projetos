public class Main {
    public static void main(String[] args) {
        GestaoFuncionarios gestao = new GestaoFuncionarios();

        Funcionario f1 = new Funcionario("João", "Assistente", 3200);
        Funcionario f2 = new Gerente("Augusto", 7000, 1500);
        Funcionario f3 = new Programador("Pedro", 6600, "Java");

        gestao.adicionarFuncionario(f1);
        gestao.adicionarFuncionario(f2);
        gestao.adicionarFuncionario(f3);

        System.out.println("Lista de Funcionários:");
        gestao.listarFuncionarios();

        System.out.println("\nAtualizando salário de Alice...");
        f1.setSalario(3500);
        gestao.atualizarFuncionario(0, f1);

        System.out.println("\nLista de Funcionários Atualizada:");
        gestao.listarFuncionarios();

        System.out.println("\nExcluindo Bob...");
        gestao.excluirFuncionario(1);

        System.out.println("\nLista de Funcionários Final:");
        gestao.listarFuncionarios();
    }
}