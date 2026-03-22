public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca, String marcaProcessador, String modeloProcessador, double frequencia) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProcessador, modeloProcessador, frequencia);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
