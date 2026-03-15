import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    private int id;
    private String nome;
    private final List<Questao> questoes;

    public Avaliacao() {
        this.questoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
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

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao questao = new Questao(num, texto, peso);
        questoes.add(questao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avaliacao{")
                .append("id=").append(id)
                .append(", nome='").append(nome).append('\'')
                .append(", questoes=").append(questoes)
                .append('}');
        return sb.toString();
    }
}
