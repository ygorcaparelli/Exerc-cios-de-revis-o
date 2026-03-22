public class TestaProjetoSoftware {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(1, "Sistema de Gestao");

        Programador programador1 = new Programador(1, "Ana", "Java");
        Programador programador2 = new Programador(2, "Carlos", "Python");
        Programador programador3 = new Programador(3, "Beatriz", "JavaScript");

        projeto.adicionarProgramador(programador1);
        projeto.adicionarProgramador(programador2);
        projeto.adicionarProgramador(programador3);

        projeto.listarProgramadores();
    }
}
