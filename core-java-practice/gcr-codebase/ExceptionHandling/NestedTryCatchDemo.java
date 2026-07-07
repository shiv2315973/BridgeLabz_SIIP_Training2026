public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
                throw new RuntimeException("Wrapped exception in nested try", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Outer catch: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
        System.out.println("Program ended.");
    }
}
