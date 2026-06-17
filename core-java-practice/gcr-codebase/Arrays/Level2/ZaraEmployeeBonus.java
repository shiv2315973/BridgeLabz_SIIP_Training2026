import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmounts = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < salaries.length; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmounts[i] = salaries[i] * 0.05;
            } else {
                bonusAmounts[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonusAmounts[i];
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) + " old salary: " + salaries[i]
                    + ", bonus: " + bonusAmounts[i] + ", new salary: " + newSalaries[i]);
        }

        System.out.println("Total bonus payout is " + totalBonus);
        System.out.println("Total old salary is " + totalOldSalary);
        System.out.println("Total new salary is " + totalNewSalary);

        input.close();
    }
}
