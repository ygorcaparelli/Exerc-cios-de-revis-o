public class TestaVendaSupermercado {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Arroz", 28.90);
        Produto produto2 = new Produto(2, "Feijao", 9.50);

        Cliente cliente = new Cliente(1, "Fernanda");

        Venda venda = new Venda(1, cliente);
        venda.adicionarItemVenda(1, 2, produto1);
        venda.adicionarItemVenda(2, 3, produto2);

        System.out.println(venda);
    }
}
