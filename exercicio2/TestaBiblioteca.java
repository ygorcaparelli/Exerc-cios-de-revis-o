import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1, "Maria Souza");
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis");

        Emprestimo emprestimo = new Emprestimo(
                LocalDate.of(2026, 3, 22),
                LocalDate.of(2026, 3, 29),
                leitor,
                livro
        );

        System.out.println(emprestimo);
    }
}
