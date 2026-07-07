public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println("Value at index 2: " + numbers[2]);
            System.out.println("Value at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Please access a valid array index.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
