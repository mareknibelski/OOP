package b_Zadania_domowe.a_Dzien_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(123456789);
        ba.depositCash(-40);
        ba.depositCash(301);
        System.out.println(ba.getNumber());
        System.out.println(ba.getCash());
        System.out.println(ba.printInfo());
        System.out.println(ba.withdrawCash(300));
        System.out.println(ba.withdrawCash(2));
        System.out.println(ba.withdrawCash(-100));
        ba.depositCash(1000);
        System.out.println(ba.printInfo());
        System.out.println();

        Author author = new Author(1, "Adam",
                "Mickiewicz", "admistrz");
        Author author1 = new Author(2, "Maria",
                "Konopnicka", "markonpka");
        System.out.println(author);
        System.out.println(author1);
        System.out.println();

        Author[] authors = {author, author1};
        System.out.println(Arrays.toString(authors));

        Book book = new Book(1, "Marek");
        Book book1 = new Book(2, "Madzia", new Author(3,
                "Bolesław", "Prus", "Bopru"));
        Book book2 = new Book(3, "Wiki", new Author(4,
                "Dorota", "Masłowska", "Domas"),
                new Author[0]);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        book.setId(1)
                .setTitle("Marek")
                .setAvailable(true)
                .setAuthor(new Author(5, "Andrzej",
                        "Sabkowski", "Wiedźmin"))
                .setAdditionalAuthors(authors);
        System.out.println(book);
        System.out.println();

        User user = new User(1, "Marek", "Nibelski");
        User user1 = new User(2, "Magdalena", "Żak");
        user.addBook(book);
        user1.addBook(book1);
        System.out.println(user);
        System.out.println(user1);
        System.out.println();

        book2.setCurrentUser(user);
        System.out.println(book2.getId());
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(Arrays.toString(book2.getAdditionalAuthors()));
        System.out.println(book2.getAvailable());

    }

}
