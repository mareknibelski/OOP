package a_Zadania.a_Dzien_1.a_Pierwsza_klasa;


public class Main1 {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Nini";
        cat.voice = "miałczy";
        cat.goStraight();
        System.out.println(cat);

        Dog dog = new Dog();
        dog.name = "Api";
        dog.voice = "szczeka";
        dog.goStraight();
        System.out.println(dog);

        if ((Object)cat == (Object) dog) {
            System.out.println("Obiekty są równe");
        } else {
            System.out.println("Obiekty nie są równe");
        }

    }

}
