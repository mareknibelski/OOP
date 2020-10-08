package a_Zadania.a_Dzien_1.c_Metody;

public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person);

        System.out.println(person.getFullName());
        System.out.println(person.increaseAge());

        person.setName("Magdalena")
                .setSurname("Żak")
                .setAge(29)
                .setGender("k");

        System.out.println(person);

        System.out.println(person.getFullName());
        System.out.println(person.increaseAge());

        Car car = new Car();
        car.setBrand("Volkswagen")
                .setModel("Passat")
                .setPrice(25000.00);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());

        System.out.println(car);

    }

}
