package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import java.util.Arrays;

public class AdvancedCalculator {

    public static String[] globalHistory = new String[0];

    public static final double PI = 3.14159265;

    public static double computeCircleRadius(double r) {
        return PI * Math.pow(r, 2);
//      historai jest przypisan do kontekstu (wymaga obiektu)
//      natomiast ta funkcja nie potrzebuje żadnego obiektu aby zadziałać
    }

    public static void printGlobalOperations() {
        System.out.println(Arrays.toString(globalHistory));
    }

    public static void printGlobalOperations(int length) {

        for (int i = 0; i < length; i++) {
            if (i < globalHistory.length) {
                System.out.println(globalHistory[globalHistory.length - i - 1]);
            } else {
                break;
            }
        }
    }

    public static void printGlobalOperations(String length) {
        try {
            int lenghtInt = Integer.valueOf(length);

            printGlobalOperations(lenghtInt);
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidłowy format liczbowy" + e.getMessage());
        }
    }

}
