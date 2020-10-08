package a_Zadania.a_Dzien_1.c_Metody;

public class Person {

    private String name = "Marek";
    private String surname = "Nibelski";
    private int age = 35;
    private String gender = "m";

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public int increaseAge() {
        return this.age = this.age + 1;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + gender;
    }

}
