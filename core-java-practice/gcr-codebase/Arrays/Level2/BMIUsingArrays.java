import java.util.Scanner;

public class BMIUsingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weights[i] = input.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            heights[i] = input.nextDouble();

            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " Height: " + heights[i]
                    + ", Weight: " + weights[i] + ", BMI: " + bmis[i]
                    + ", Status: " + weightStatus[i]);
        }

        input.close();
    }
}
