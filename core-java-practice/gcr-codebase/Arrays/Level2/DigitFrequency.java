import java.util.Scanner;

public class DigitFrequency {
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
        int[] frequency = new int[10];
        tempNumber = Math.abs(number);

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + " is " + frequency[i]);
            }
        }

        input.close();
    }
}
