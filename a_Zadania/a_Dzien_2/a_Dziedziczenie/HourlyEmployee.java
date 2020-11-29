package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class HourlyEmployee extends Employee{

    public HourlyEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public double computePayment(double hours) {
        double cashForAnHour = salary / 21 / 8;
        this.salary = cashForAnHour * hours;
        return salary;
    }

}
