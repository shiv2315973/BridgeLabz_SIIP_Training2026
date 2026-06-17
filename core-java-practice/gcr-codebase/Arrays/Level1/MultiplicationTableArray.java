import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] multiplicationTable = new int[10];

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= multiplicationTable.length; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        for (int i = 1; i <= multiplicationTable.length; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        input.close();
    }
}
