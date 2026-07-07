public class Printnumber {
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing numbers from " + n + " down to 1:");
        printNumbers(n);
    }
}
