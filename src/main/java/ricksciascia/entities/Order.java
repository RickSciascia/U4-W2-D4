package ricksciascia.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private static long Counter = 0;
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> productsList;
    private Customer customer;

//    costruttore
    public Order(List<Product> productsList, Customer customer) {
        this.id = Counter++;
        this.status = "Pending";
        this.orderDate =  LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(3);
        this.productsList = productsList;
        this.customer = customer;
    }
//    GETTER E SETTER
//    GETTER

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public static long getCounter() {
        return Counter;
    }

//    SETTER

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", productsList=" + productsList +
                ", customer=" + customer +
                '}';
    }
}
