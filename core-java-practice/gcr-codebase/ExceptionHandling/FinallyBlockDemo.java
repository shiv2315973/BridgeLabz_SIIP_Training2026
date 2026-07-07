public class FinallyBlockDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 0};
        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
