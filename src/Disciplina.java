import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private final List<Aluno> alunos;
    private final List<Avaliacao> avaliacoes;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao avaliacao = new Avaliacao(id, nome);
        avaliacoes.add(avaliacao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina{")
                .append("id=").append(id)
                .append(", nome='").append(nome).append('\'')
                .append(", professor='").append(professor).append('\'')
                .append(", alunos=").append(alunos)
                .append(", avaliacoes=").append(avaliacoes)
                .append('}');
        return sb.toString();
    }
}
