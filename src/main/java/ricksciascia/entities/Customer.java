package ricksciascia.entities;

public class Customer {
    private static long idCounter = 0;
    private long id;
    private String name;
    private int tier;

//    costruttore
    public Customer(String name, int tier) {
        this.name = name;
        this.tier = tier;
        this.id = idCounter++;
    }
//    GETTER

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }
//    SETTER

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}

