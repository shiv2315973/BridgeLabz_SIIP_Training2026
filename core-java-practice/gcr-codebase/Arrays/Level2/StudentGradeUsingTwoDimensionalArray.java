import java.util.Scanner;

public class StudentGradeUsingTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter physics marks of student " + (i + 1) + ": ");
            marks[i][0] = input.nextDouble();

            System.out.print("Enter chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = input.nextDouble();

            System.out.print("Enter maths marks of student " + (i + 1) + ": ");
            marks[i][2] = input.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = findGrade(percentages[i]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " Physics: " + marks[i][0]
                    + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]
                    + ", Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }

        input.close();
    }

    public static String findGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        }
        return "Fail";
    }
}
