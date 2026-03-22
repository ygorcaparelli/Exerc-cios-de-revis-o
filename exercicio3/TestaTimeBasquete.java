public class TestaTimeBasquete {
    public static void main(String[] args) {
        Atleta atleta = new Atleta(1, "Lucas Dias", "Ala-pivo");
        Time time = new Time(1, "Franca Basquete", "Helinho Garcia");

        time.contratarAtleta(atleta);

        System.out.println("Antes de anular o time:");
        System.out.println(time);

        time = null;

        System.out.println("Depois de anular o time, o atleta continua existindo:");
        System.out.println(atleta);
    }
}
