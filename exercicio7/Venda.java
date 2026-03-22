import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itensVenda = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void adicionarItemVenda(int idItem, int quantidade, Produto produto) {
        ItemVenda itemVenda = new ItemVenda(idItem, quantidade, produto);
        itensVenda.add(itemVenda);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda itemVenda : itensVenda) {
            total += itemVenda.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", itensVenda=" + itensVenda +
                ", total=" + calcularTotal() +
                '}';
    }
}
