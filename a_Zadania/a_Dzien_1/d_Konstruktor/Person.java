package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + gender;
    }

}
