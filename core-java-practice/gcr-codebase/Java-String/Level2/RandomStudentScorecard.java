import java.util.Scanner;

public class RandomStudentScorecard {
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }

        return scores;
    }

    public static double[][] calculateScoreData(int[][] scores) {
        double[][] scoreData = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;

            scoreData[i][0] = Math.round(total * 100.0) / 100.0;
            scoreData[i][1] = Math.round(average * 100.0) / 100.0;
            scoreData[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return scoreData;
    }

    public static String[] calculateGrades(double[][] scoreData) {
        String[] grades = new String[scoreData.length];

        for (int i = 0; i < scoreData.length; i++) {
            double percentage = scoreData[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "Fail";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] scoreData, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1]
                    + "\t\t" + scores[i][2] + "\t" + scoreData[i][0] + "\t"
                    + scoreData[i][1] + "\t" + scoreData[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] scores = generateScores(numberOfStudents);
        double[][] scoreData = calculateScoreData(scores);
        String[] grades = calculateGrades(scoreData);

        displayScorecard(scores, scoreData, grades);

        input.close();
    }
}
