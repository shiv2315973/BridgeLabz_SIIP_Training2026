import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ram marks: ");
        int ram = sc.nextInt();

        System.out.print("Shyam marks: ");
        int shyam = sc.nextInt();

        if(ram > shyam)
            System.out.println("Ram scored higher");
        else if(shyam > ram)
            System.out.println("Shyam scored higher");
        else
            System.out.println("Both scored equal");

        sc.close();
    }
}