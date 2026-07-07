public class SumNaturalNumbers {
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
    }
}
