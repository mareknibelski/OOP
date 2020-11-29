package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class Main1 {

    public static void main(String[] args) {

        System.out.println(AdvancedCalculator.computeCircleRadius(3));

        AdvancedCalculator adCalc = new AdvancedCalculator();

        Calculator calc = new Calculator();

        calc.add(2 , 2);
        calc.subtract(3, 2);
        calc.add(4, 8);
        calc.clearOperations();
        calc.subtract( 8, 2);
        calc.divide(3, 6);
        calc.printOperations();

        AdvancedCalculator.printGlobalOperations(5);

        AdvancedCalculator.printGlobalOperations("5");
        System.out.println();
        
        ShoppingCart shoppingCart =new ShoppingCart();

        Product p1 = new Product("chleb", "świerzy", 3.89);
        Product p2 = new Product("śmietana", "bardzo dobra", 1.09);
        Product p3 = new Product("szynka" , "najlepsza", 34.99);
        Product p4 = new Product("masło", "nowe", 6.99);

        try {
            shoppingCart.addProduct(p1);
            shoppingCart.addProduct(p2);
            shoppingCart.addProduct(p3);
            shoppingCart.addProduct(p4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        shoppingCart.printReceipt();
        System.out.println();
        shoppingCart.removeProduct(3);
        shoppingCart.printReceipt();
        System.out.println();
        shoppingCart.changeProductQuantity(2, 3);
        shoppingCart.printReceipt();
        System.out.println();

    }

}
