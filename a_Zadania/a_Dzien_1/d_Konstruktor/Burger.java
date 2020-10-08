package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Burger {

    private double size = 22.0;
    private double price = 7.50;

    public Burger() {
    }

    public Burger(double size, double price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger o rozmiarze: " + size + " kosztuje " + price + "zł.";
    }

}
