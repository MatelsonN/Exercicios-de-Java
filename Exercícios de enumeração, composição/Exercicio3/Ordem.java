package Exercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    private Date momento;
    private OrdemStatus status;

    private List<OrdemItem> pedidos = new ArrayList<>();

    public Ordem(Date momento, OrdemStatus status) {
        this.momento = momento;
        this.status = status;
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
        for (OrdemItem c : pedidos) {
            soma += c.getPreco();
        }
        return soma;
    }

}
