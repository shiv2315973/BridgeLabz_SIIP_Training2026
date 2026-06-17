import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int formula = n * (n + 1) / 2;
        int loopSum = 0;

        for(int i = 1; i <= n; i++) {
            loopSum += i;
        }

        System.out.println("Formula Sum = " + formula);
        System.out.println("Loop Sum = " + loopSum);

        sc.close();
    }
}