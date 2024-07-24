package exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade;

import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.Enum.OrdemStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private OrdemStatus status;

    private Cliente clientes;
    private List<OrdemItem> pedidos = new ArrayList<>();

    public Ordem(Date momento, OrdemStatus status, Cliente clientes) {
        this.momento = momento;
        this.status = status;
        this.clientes = clientes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public List<OrdemItem> getPedidos() {
        return pedidos;
    }

    public void adicionarItem(OrdemItem pedido) {
        pedidos.add(pedido);
    }

    public void removerItem(OrdemItem pedido) {
        pedidos.remove(pedido);
    }

    public double total() {
        int soma = 0;
        for (OrdemItem item : pedidos) {
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO:");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(clientes + "\n");
        sb.append("Itens de pedido:\n");
        for (OrdemItem item : pedidos) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: R$ ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
