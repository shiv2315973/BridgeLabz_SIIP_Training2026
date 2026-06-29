import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double total() { return price * quantity; }
    }

    static class Cart {
        private ArrayList<CartItem> items = new ArrayList<>();

        public void addItem(String name, double price, int qty) {
            items.add(new CartItem(name, price, qty));
        }

        public void removeItem(String name) {
            Iterator<CartItem> it = items.iterator();
            while (it.hasNext()) {
                if (it.next().itemName.equals(name)) {
                    it.remove();
                    return;
                }
            }
        }

        public double totalCost() {
            double sum = 0;
            for (CartItem it : items) sum += it.total();
            return sum;
        }

        public void display() {
            System.out.println("Cart contents:");
            for (CartItem it : items) System.out.println(it.itemName + " x" + it.quantity + " = " + it.total());
            System.out.println("Total: " + totalCost());
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem("Pen", 10.0, 2);
        cart.addItem("Notebook", 50.0, 1);
        cart.display();
        cart.removeItem("Pen");
        System.out.println("After removal:");
        cart.display();
    }
}
