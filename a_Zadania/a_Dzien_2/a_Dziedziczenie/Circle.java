package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape{

    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " oraz o promieniu radius: " + radius;
    }

    public double getArea() {
        double r2 = Math.pow(radius, 2);
        double p = Math.PI * r2;
        return p;
    }

    public double getCircuit() {
        double o = 2 * Math.PI * radius;
        return o;
    }

}
