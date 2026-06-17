import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double heightInCm = input.nextDouble();
        double totalInches = heightInCm / 2.54;
        double feet = totalInches / 12;
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightInCm
                + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
