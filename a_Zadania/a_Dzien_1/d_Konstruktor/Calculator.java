package a_Zadania.a_Dzien_1.d_Konstruktor;

import a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc.AdvancedCalculator;

import java.util.Arrays;

public class Calculator {

    private String[] history;

    public Calculator() {
        this.history = new String[0];
    }

    public void add(int num1, int num2) {
        int result = num1 + num2;
//        history = new String[]{"added " + num1 + " to " + num2 + " got " + result};
        addToHistory("added " + num1 + " to " + num2 + " got " + result);
    }

    public void multiply(int num1, int num2) {
        int result = num1 * num2;
//        history = new String[]{"multiplied " + num1 + " with " + num2 + " got " + result};
        addToHistory("multiplied " + num1 + " with " + num2 + " got " + result);
    }

    public void subtract(int num1, int num2) {
        int result = num1 - num2;
//        history = new String[]{"subtracted " + num1 + " from " + num2 + " got " + result};
        addToHistory("subtracted " + num1 + " from " + num2 + " got " + result);
    }

    public void divide(int num1, int num2) {
        int result = num1 / num2;
//        history = new String[]{"divided " + num1 + " by " + num2 + " got " + result};
        addToHistory("divided " + num1 + " by " + num2 + " got " + result);
    }

    public void printOperations() {
        System.out.println(Arrays.toString(this.history));
    }

    public void clearOperations() {
        this.history = new String[0];
    }

    protected void addToHistory(String val) {
        AdvancedCalculator.globalHistory = Arrays.copyOf(AdvancedCalculator.globalHistory, AdvancedCalculator.globalHistory.length + 1);
        AdvancedCalculator.globalHistory[AdvancedCalculator.globalHistory.length - 1] = val;

        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history[this.history.length - 1] = val;
    }

}
