package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Main1 {

    public static void main(String[] args) {

        Burger burger = new Burger();
        Burger burger1 = new Burger();
        Burger burger2 = new Burger();

        System.out.println(burger);
        System.out.println(burger1);
        System.out.println(burger2);

        Calculator calc = new Calculator();
        calc.add(4, 2);
        calc.printOperations();
        calc.multiply(4, 2);
        calc.printOperations();
        calc.clearOperations();
        calc.subtract(4, 2);
        calc.printOperations();
        calc.divide(4, 2);
        calc.printOperations();

    }

}
