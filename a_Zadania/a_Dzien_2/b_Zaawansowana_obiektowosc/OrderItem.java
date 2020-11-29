package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public OrderItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public long getProductId() {
        return product.getId();
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalSum() {
        double result = 0.0;
        result = quantity * product.getPrice();
        if (quantity >= 3) {
            result = result - (result * (20d / 100d));
        } else {
            result = quantity * product.getPrice();
        }
        return result;
    }

    public String getProductRow() {
        return getProductId() + "|" + product.getProduct() + "|" + quantity +
                " x " + product.getPrice() + " PLN = " + getTotalSum() + " PLN";
    }

}
