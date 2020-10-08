package a_Zadania.a_Dzien_1.b_Atrybuty;

public class Person {

    public String name = "Marek";
    public String surname = "Nibelski";
    public int age = 35;
    public String gender = "m";

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + gender;
    }

}
