public class TestaComputador {
    public static void main(String[] args) {
        Computador computador = new Computador(1, "Dell", "Intel", "Core i7", 3.4);

        System.out.println("Antes de anular o computador:");
        System.out.println(computador);

        computador = null;

        System.out.println("Depois de anular o computador, o processador tambem deixa de existir com ele.");
    }
}
