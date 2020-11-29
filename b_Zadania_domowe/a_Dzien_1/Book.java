package b_Zadania_domowe.a_Dzien_1;


import java.util.Arrays;

public class Book {

    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;
    private User currentUser;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Book setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
        return this;
    }

    public Book setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        this.available = false;
        currentUser.addBook(this);
        return this;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getAvailable() {
        return available;
    }

    public Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    @Override
    public String toString() {
        return this.id + " " + this.title + " " + this.available + " " +
                this.author + " " + Arrays.toString(additionalAuthors) + " " +
                this.currentUser;
    }

}
