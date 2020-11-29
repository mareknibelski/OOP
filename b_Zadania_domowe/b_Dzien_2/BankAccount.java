package b_Zadania_domowe.b_Dzien_2;

public class BankAccount {

    private int number;
    private double cash = 0d;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.cash = cash + amount;
        } else {
            System.out.println("Nie oszukuj!!!");
        }
    }

    public double withdrawCash(double amount) {
        if (amount > 0) {
            if (amount > cash) {
                this.cash = cash - cash;
            } else {
                this.cash = cash - amount;
            }
        } else {
            System.out.println("Nie oszukuj!!!");
        }
        return cash;
    }

    public String printInfo() {
        return "Numer konta: " + this.number + " posiada na koncie: " +
                this.cash + " zł.";
    }

}
