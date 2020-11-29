package b_Zadania_domowe.b_Dzien_2;


import java.util.Arrays;

public class Book {

    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;
    private User currentUser;
    private int popularity = 0;

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
        this.popularity = popularity + 1;
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

    public boolean equals(Book book) {
        if (this.getId() == book.getId()) {
            return true;
        } else {
            return false;
        }
    }

    public Book returnBook() {
        this.available = true;
        return this;
    }

    @Override
    public String toString() {
        return this.id + " " +
                this.title + " " +
                this.available + " " +
                this.author + " " +
                this.currentUser + " " +
                this.popularity;
    }

}
