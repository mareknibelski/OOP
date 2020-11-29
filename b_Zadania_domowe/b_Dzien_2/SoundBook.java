package b_Zadania_domowe.b_Dzien_2;

import java.time.LocalTime;

public class SoundBook extends Book{

    private LocalTime duration;
    private int numberOfCarries;

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors, LocalTime duration,
                     int numberOfCarries) {
        super(id, title, author, additionalAuthors);
        this.duration = duration;
        this.numberOfCarries = numberOfCarries;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.duration + " " + this.numberOfCarries;
    }

}
