public class WelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Junior Coder";
        double salary = 50000.0;
        float membershipFee = 999.50f;
        int annualBonus = (int) (salary * 0.12);
        System.out.println("WELCOME TO THE GUILD");

        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Rank            : " + rank);
        System.out.println("Salary          : ₹" + salary);
        System.out.println("Membership Fee  : ₹" + membershipFee);
        System.out.println("Annual Bonus    : ₹" + annualBonus);

    }
}