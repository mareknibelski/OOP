package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main2 {

    public static void main(String[] args) {

        Attribute attr = new Attribute();
        attr.defaultAttribute = "attr";
        attr.protectedAttribute = "attr";
        attr.publicAttribute = "attr";

        System.out.println(attr.defaultAttribute);
        System.out.println(attr.protectedAttribute);
        System.out.println(attr.publicAttribute);

    }

}
