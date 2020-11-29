package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator() {
        super();
    }

    public double pow(int num1, int num2) {
        double result = Math.pow(num1, num2);

        addToHistory(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    public double root(int num1, int num2) {
        double result = Math.pow(num1, (1/num2));
        addToHistory("root " + num2 + " of " + num1 + " equals " + result);
        return result;
    }

    @Override
    public void add(int a, int b) {
        super.add(a, b);
        int result = a + b + 1000;
        addToHistory("Dodaje lepiej oto mój nowy wynik: " + result);
    }
}
