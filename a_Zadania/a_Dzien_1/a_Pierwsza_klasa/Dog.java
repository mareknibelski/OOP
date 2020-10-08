package a_Zadania.a_Dzien_1.a_Pierwsza_klasa;

public class Dog {

    String name;
    String voice;

    public void goStraight() {
        System.out.println(name + " szaleje w domu.");
    }

    @Override
    public String toString() {
        return name + " jest psem i " + voice;
    }

}
