public class ItemInventory {
    static class Item {
        private String itemCode;
        private String itemName;
        private double price;

        public Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Item Details:");
            System.out.println("Code: " + itemCode);
            System.out.println("Name: " + itemName);
            System.out.println("Price: " + price);
        }

        public double totalCost(int quantity) {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        Item item = new Item("IT1001", "USB-C Cable", 9.99);
        item.displayDetails();
        int qty = 3;
        System.out.println("Total cost for quantity " + qty + ": " + item.totalCost(qty));
    }
}
