package secao13.entities1;

import secao13.entities1.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private List<OrderItem> order = new ArrayList<>();

    Client client;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrder() {
        return order;
    }

    public void addItem(OrderItem item) {
        order.add(item);
    }

    public void removeItem(OrderItem item) {
        order.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for ( OrderItem item : order) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(order + "\n");
        sb.append("Client : ");
        sb.append( client + "\n");
        sb.append("Order items:" + "\n");
        for (OrderItem items : order) {
            sb.append(items + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
