public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Residencial Primavera", "Rua das Flores, 100");

        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(202, 2);
        edificio.construirApartamento(303, 3);

        System.out.println(edificio);
    }
}
