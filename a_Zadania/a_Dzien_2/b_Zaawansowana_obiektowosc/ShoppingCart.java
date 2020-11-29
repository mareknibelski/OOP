package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<OrderItem> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product newProduct) throws Exception {
        if (!(newProduct instanceof Product)) {
            throw new Exception("Nie jest to produkt klasy Produkt");
        }

        boolean found = false;
        int oldQuantity = 0;

        for (OrderItem orderItem : products) {
            if (orderItem.getProductId() == newProduct.getId()) {
                found = true;
                oldQuantity = orderItem.getQuantity();
            }
        }

        if (!found) {
            OrderItem o1 = new OrderItem(newProduct, 1);
            products.add(o1);
        } else {
            changeProductQuantity(newProduct.getId(), oldQuantity + 1);
        }
    }

    public void removeProduct(int productId) {
        for (OrderItem order : products) {
            if (order.getProductId() == productId) {
                products.remove(order);
                break;
            }
        }
    }

    public void changeProductQuantity(long productId, int newQuantity) {
        for (OrderItem order : products) {
            if (order.getProductId() == productId) {
                order.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void printReceipt() {
        double sum = 0.0;
        for (OrderItem o : products) {
            sum += o.getTotalSum();
            System.out.println(o.getProductRow());
        }
        System.out.println("-------------------------");
        System.out.println("Razem: " + sum + " PLN");
    }

}
