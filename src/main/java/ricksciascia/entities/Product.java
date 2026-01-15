package ricksciascia.entities;

public class Product {
//    attributi
    private static long idCounter = 0;
    private long id;
    private String name;
    private String category;
    private double price;

    // costruttore

    public Product(String name, String category, double price) {
    this.id = idCounter++;
    this.name = name;
    this.category = category;
    this.price = price;
    }
//    metodi getter e setter
//    GETTER
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
//    SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
