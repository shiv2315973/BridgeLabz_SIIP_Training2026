import java.util.Scanner;

public class PowerRecursion {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        if (exponent < 0) {
            System.out.println("Negative exponent not supported by this example.");
        } else {
            System.out.println(base + "^" + exponent + " = " + power(base, exponent));
        }
        sc.close();
    }
}
