package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {

    private static long nextId = 1L;
    private long id;
    private String name;
    private String description;
    private double price;
    private int quantity;


    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = nextId;
        this.nextId++;
    }

    public Product setPrice(double price) {
        if (price > 0.01) {
            this.price = price;
        } else {
            this.price = this.price;
        }
        return this;
    }

    public String getProduct() {
        return this.name + " " + this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.description + " "
                + this.price + " " + this.quantity;
    }

}
