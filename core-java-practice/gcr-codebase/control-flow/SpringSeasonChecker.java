import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if(month >= 3 && month <= 5)
            System.out.println("Spring Season");
        else
            System.out.println("Not Spring Season");

        sc.close();
    }
}