package b_Zadania_domowe.b_Dzien_2;


import java.time.LocalTime;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Marek", "Nibelski");
        Person p2 = new Person(2, "Magdalena", "Żak");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        Author a1 = new Author(1, "Marek", "Nibelski","MaRcZaN");
        Author a2 = new Author(2, "Felisk", "Zytniewski", "Zyt");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();

        User u1 = new User(1, "Lena", "Mak");
        User u2 = new User(2, "Mirosław", "Mróz");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println();

        Book b1 = new Book(1, "Mały książe", new Author(3, "Antionie",
                "de Saint-Exupery", "AdSE"));
        Book b2 = new Book(2, "Bajki robotów", new Author(4, "Stanisław",
                "Lem", "Starlem"));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();

        SoundBook sb1 = new SoundBook(1, "Angielski", new Author(5, "Arlena",
                "Witt", "Alwit"), new Author[0], LocalTime.of(00, 4,
                8), 4);
        System.out.println(sb1);
        System.out.println();

        b1.equals(b1);
        b1.equals(b2);
        System.out.println();

        b1.returnBook();
        System.out.println(b1);
        b1.setCurrentUser(u1);
        System.out.println(b1);
        b1.returnBook();
        System.out.println(b1);
        b1.setCurrentUser(u1);
        System.out.println(b1);
        b1.returnBook();
        System.out.println(b1);
        b1.setCurrentUser(u2);
        System.out.println(b1);
        System.out.println();

        System.out.println(b2);
        b2.setCurrentUser(u2);
        System.out.println(b2);
        b2.setCurrentUser(u1);
        System.out.println(b2);
        b2.setCurrentUser(u2);
        System.out.println(b2);
        System.out.println();

        b1.getCurrentUser().returnBook(b1);
        System.out.println(b1);
        b2.getCurrentUser().returnAllBooks();
        System.out.println(b2);

    }

}
