import java.util.Scanner;

public class TeamBMIReport {
    public static String[] findBMIAndStatus(double weight, double heightInCm) {
        double heightInMeter = heightInCm / 100.0;
        double bmi = weight / (heightInMeter * heightInMeter);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(Math.round(bmi * 100.0) / 100.0), status};
    }

    public static String[][] createBMIReport(double[][] personData) {
        String[][] bmiReport = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            String[] bmiAndStatus = findBMIAndStatus(personData[i][0], personData[i][1]);
            bmiReport[i][0] = String.valueOf(personData[i][1]);
            bmiReport[i][1] = String.valueOf(personData[i][0]);
            bmiReport[i][2] = bmiAndStatus[0];
            bmiReport[i][3] = bmiAndStatus[1];
        }

        return bmiReport;
    }

    public static void displayBMIReport(String[][] bmiReport) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < bmiReport.length; i++) {
            System.out.println((i + 1) + "\t" + bmiReport[i][0] + "\t\t"
                    + bmiReport[i][1] + "\t\t" + bmiReport[i][2] + "\t" + bmiReport[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][2];

        for (int i = 0; i < personData.length; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in cm: ");
            personData[i][1] = input.nextDouble();
        }

        String[][] bmiReport = createBMIReport(personData);
        displayBMIReport(bmiReport);

        input.close();
    }
}
