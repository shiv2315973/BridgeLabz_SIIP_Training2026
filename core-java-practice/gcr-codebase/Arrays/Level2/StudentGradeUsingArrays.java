import java.util.Scanner;

public class StudentGradeUsingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter physics marks of student " + (i + 1) + ": ");
            physics[i] = input.nextDouble();

            System.out.print("Enter chemistry marks of student " + (i + 1) + ": ");
            chemistry[i] = input.nextDouble();

            System.out.print("Enter maths marks of student " + (i + 1) + ": ");
            maths[i] = input.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = findGrade(percentages[i]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " Physics: " + physics[i]
                    + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i]
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
