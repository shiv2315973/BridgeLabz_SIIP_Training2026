import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int i = num / 2;

        while(i >= 1) {
            if(num % i == 0) {
                System.out.println("Greatest Factor = " + i);
                break;
            }
            i--;
        }
        sc.close();
    }
}