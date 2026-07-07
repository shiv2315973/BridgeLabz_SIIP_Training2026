public class Pratices {
    public static void main(String[] args) {
        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        System.out.println("Example of exception handling in practices.");
    }
}
