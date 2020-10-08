package a_Zadania.a_Dzien_1.c_Metody;

import java.util.SplittableRandom;

public class Car {

    private String brand;
    private String model;
    private double price;

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.model + " " + this.price;
    }

}
