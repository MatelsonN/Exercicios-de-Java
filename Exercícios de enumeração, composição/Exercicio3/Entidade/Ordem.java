package Exercicio3.Entidade;

import Exercicio3.Entidade.Enum.OrdemStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

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
        for (OrdemItem c : pedidos) {
            soma += c.getPreco();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO:");
        sb.append("\nMomento do pedido: " + momento);
        sb.append("\nStatus do pedido: " + status);
        sb.append("\nCliente: " + clientes.getNome() +
                "(" + clientes.getDataDeNascimento() + ") - " +
                clientes.getEmail());
        return sb.toString();
    }
}
