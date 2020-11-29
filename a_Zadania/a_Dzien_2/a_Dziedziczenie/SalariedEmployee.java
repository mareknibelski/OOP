package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {

    public SalariedEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public double computePayment() {
        int hours = 190;
        double cashForAnhour = this.salary / 21 / 8;
        this.salary = cashForAnhour * hours;
        return salary;
    }

}
