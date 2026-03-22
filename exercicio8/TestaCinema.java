import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme filme1 = new Filme(1, "Batman", "Acao", 176);
        Filme filme2 = new Filme(2, "Duna", "Ficcao Cientifica", 155);

        Sessao sessao = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 1);

        sessao.vincularFilme(filme1);

        sessao.venderIngresso(1, "A1", "Inteira", 40.0f);
        sessao.venderIngresso(2, "A2", "Meia", 20.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 40.0f);

        System.out.println(filme2);
        System.out.println(sessao);
    }
}
