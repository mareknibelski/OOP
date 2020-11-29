package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {

    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "środek tego kształtu przyjmuje współrzędne x: " + x + " i y: " + y +
                " o kolorze: " + color;
    }

    public double getDistance(Shape shape) {
        double a = this.x - shape.x;
        double b = this.y - shape.y;
        double powA = Math.pow(a, 2);
        double powB = Math.pow(b, 2);
        double sumPow = powA + powB;
        double sqrtPow = Math.sqrt(sumPow);
        return sqrtPow;
    }

}
