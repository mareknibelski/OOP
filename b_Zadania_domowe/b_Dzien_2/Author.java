package b_Zadania_domowe.b_Dzien_2;


public class Author extends Person {

    private String pseudonym;

    public Author(int id, String firstName, String lastName, String pseudonym) {
        super(id, firstName, lastName);
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.pseudonym;
    }

}
