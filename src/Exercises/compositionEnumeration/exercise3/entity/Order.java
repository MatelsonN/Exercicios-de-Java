package compositionEnumerationExercise.exercise3.entity;

import compositionEnumerationExercise.exercise3.entity.enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client clients;
    private List<OrderItem> requests = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client clients) {
        this.moment = moment;
        this.status = status;
        this.clients = clients;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }

    public List<OrderItem> getRequests() {
        return requests;
    }

    public void addItem(OrderItem request) {
        requests.add(request);
    }

    public void removeItem(OrderItem request) {
        requests.remove(request);
    }

    public double total() {
        int sum = 0;
        for (OrderItem item : requests) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(clients + "\n");
        sb.append("Order Items:\n");
        for (OrderItem item : requests) {
            sb.append(item + "\n");
        }
        sb.append("Total price: R$ ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
