import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            num = sc.nextInt();

            if (num > 0) {
                sum += num;
            }

        } while (num > 0);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}