package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double raiseSalary(double percent) {
        if (percent >= 0) {
            this.salary += salary * (percent / 100);
            return salary;
        } else {
            return 0.0;
        }
    }
}
