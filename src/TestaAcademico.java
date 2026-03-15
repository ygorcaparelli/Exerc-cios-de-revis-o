public class TestaAcademico {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Ana Lima", "RA2026001", "Engenharia");
        Aluno aluno2 = new Aluno(2, "Bruno Souza", "RA2026002", "Sistemas de Informacao");

        Disciplina disciplina = new Disciplina(10, "Programacao Orientada a Objetos", "Prof. Carlos");

        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);

        disciplina.criarAvaliacao(100, "Prova Semestral");

        Avaliacao avaliacao = disciplina.getAvaliacoes().get(0);
        avaliacao.adicionarQuestao(1, "Explique encapsulamento.", 3.0f);
        avaliacao.adicionarQuestao(2, "Implemente uma classe simples.", 4.0f);
        avaliacao.adicionarQuestao(3, "Explique composicao e agregacao.", 3.0f);

        System.out.println(disciplina);
    }
}
