package b_Zadania_domowe.b_Dzien_2;


import java.util.Arrays;

public class User extends Person{

    private Book[] books = new Book[0];

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        int i = 0;
        for (Book myBook : books) {
            if (!myBook.equals(book)) {
                books[i] = myBook;
                i++;
            }
        }
        books = Arrays.copyOf(books, books.length - 1);
    }

    public void returnAllBooks() {
        for (Book myBook : books) {
            returnBook(myBook);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
