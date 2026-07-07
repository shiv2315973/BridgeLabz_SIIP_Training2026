class BillAmountException extends Exception {
    public BillAmountException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static double calculateBill(double amount) throws BillAmountException {
        if (amount < 0) {
            throw new BillAmountException("Bill amount cannot be negative.");
        }
        return amount * 1.18; // Add 18% service tax
    }

    public static void main(String[] args) {
        double amount = 1200.0;
        try {
            double total = calculateBill(amount);
            System.out.println("Total bill including tax: " + total);
        } catch (BillAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
