package ricksciascia;

import ricksciascia.entities.Customer;
import ricksciascia.entities.Order;
import ricksciascia.entities.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
//        PRODOTTI SINGOLI
        Product b1 = new Product("Il mastino dei Baskerville","Books",15.00);
        Product b2 = new Product("Le croncache del fuoco e del ghiaccio","Books",19.00);
        Product b3 = new Product("Manuale di Ingegneria Elettronica","Books",120.00);
        Product b4 = new Product("Manuale di Ingegneria Informatica","Books",120.00);
        Product baby1 = new Product("Pannolini","Baby",9.00);
        Product baby2 = new Product("Omogeneizzato 50g","Baby",5.00);
        Product baby3 = new Product("Salviette umidificata","Baby",3.99);
        Product boys1 = new Product("Set LEGO - F1 - MCL39","Boys",239.99);
        Product boys2 = new Product("Set LEGO - F1 - SF25","Boys",239.99);
        Product boys3 = new Product("Set LEGO - F1 - RB19","Boys",209.99);
        Product generic1 = new Product("Acqua CLAUDIA x6","Bevande",2.50);
        Product generic2 = new Product("Carta Igienica","Igiene Casa",4.00);
//        ARRAY PRODOTTI
        ArrayList<Product> storeList = new ArrayList<>(List.of(b1,b2,b3,b4,baby1,baby2,baby3,boys1,boys2,boys3,generic1,generic2));
        ArrayList<Product> oL1 = new ArrayList<>(List.of(generic1,baby1));
        ArrayList<Product> oL2 = new ArrayList<>(List.of(generic1,generic2,boys2));
        ArrayList<Product> oL3 = new ArrayList<>(List.of(boys1,boys3,b2));
//        CLIENTI
        Customer c1 = new Customer("Pippo Franco",1);
        Customer c2 = new Customer("Claudio Bisio",2);
        Customer c3 = new Customer("Alessia Marcuzzi",1);
        Customer c4 = new Customer("Gerry Scotti",2);
//        ORDINI
        Order o1 = new Order(oL2,c4);
        Order o2 = new Order(oL1,c3);
        Order o3 = new Order(oL2,c2);
        Order o4 = new Order(oL2,c2);
        Order o5 = new Order(oL3,c4);
// ARRAY ORDINI
        ArrayList<Order> allOrders = new ArrayList<>(List.of(o1,o2,o3,o4,o5));
//        ESERCIZI
//        System.out.println("Esercizio 1");
//        Map<Customer,List<Order>> orderByCustomers = allOrders.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
//        System.out.println(orderByCustomers);


        System.out.println("Esercizio 2");
        Map<Customer, Double> totalByCustomer = allOrders.stream()
                .collect(Collectors.groupingBy(order -> order.getCustomer(),
                        Collectors.summingDouble(order -> order.getProductsList().stream()
                                .mapToDouble(product-> product.getPrice())
                                .sum())));
        totalByCustomer.forEach((customer, total) -> System.out.println("Cliente:" + customer.getName() + " Totale: "+ total));
//
//        System.out.println("Esercizio 3");
//        List<Product> sortedProductByHigherPrice = storeList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
//        sortedProductByHigherPrice.forEach(product -> System.out.println("Prodotto: " + product.getName() + " Prezzo: " + product.getPrice() + " $"));

//        System.out.println("Esercizio 4");
//        Map<Customer, Double> avgTotal = allOrders.stream()
//                .collect(Collectors.groupingBy(order -> order.getCustomer(),
//                Collectors.summingDouble(order->order.getProductsList().stream()
//                .mapToDouble(product-> product.getPrice())
//                .average().getAsDouble())));
//        avgTotal.forEach((customer, avgDouble) -> System.out.println("Cliente: " + customer.getName() + " Media ordini: " + avgDouble));

    }
}
