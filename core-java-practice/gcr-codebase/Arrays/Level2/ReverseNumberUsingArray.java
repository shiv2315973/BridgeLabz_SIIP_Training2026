import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNumber = Math.abs(number);
        int digitCount = 0;

        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                digitCount++;
                tempNumber = tempNumber / 10;
            }
        }

        int[] digits = new int[digitCount];
        int[] reverseDigits = new int[digitCount];
        tempNumber = Math.abs(number);

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        for (int i = 0; i < digits.length; i++) {
            reverseDigits[i] = digits[digits.length - 1 - i];
        }

        System.out.print("Reverse number is ");
        for (int i = reverseDigits.length - 1; i >= 0; i--) {
            System.out.print(reverseDigits[i]);
        }
        System.out.println();

        input.close();
    }
}
