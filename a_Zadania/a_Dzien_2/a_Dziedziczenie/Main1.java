package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main1 {

    public static void main(String[] args) {

        AdvancedCalculator adCalc = new AdvancedCalculator();
        adCalc.pow(2, 3);
        adCalc.printOperations();
        adCalc.root(3, 2);
        adCalc.printOperations();
        adCalc.add(8,2);
        adCalc.printOperations();

        Shape shape = new Shape(2, 2, "pomarańczowy");
        Shape shape1 = new Shape(1, 4, "niebieski");
        System.out.println(shape.getDescription());
        System.out.println(shape1.getDescription());
        System.out.println(shape.getDistance(shape1));

        Circle circle = new Circle(2, 3, "czerwony", 3);
        System.out.println(circle.getDescription());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());

        Employee emp = new Employee(1, "Marek", "Nibelski",
                7250);
        System.out.println(emp.raiseSalary(25));

        HourlyEmployee hourEmp = new HourlyEmployee(2, "Magdalena",
                "Żak", 8400);
        System.out.println(hourEmp.computePayment(8));

        SalariedEmployee salEmp = new SalariedEmployee(3, "Api",
                "Nini", 10150);
        System.out.println(salEmp.computePayment());

    }

}
