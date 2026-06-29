import java.util.Scanner;

public class BankATM {
    static class BankAccount {
        private String accountHolder;
        private String accountNumber;
        private double balance;

        public BankAccount(String holder, String number, double balance) {
            this.accountHolder = holder;
            this.accountNumber = number;
            this.balance = balance;
        }

        public void deposit(double amt) {
            if (amt > 0) balance += amt;
        }

        public boolean withdraw(double amt) {
            if (amt > 0 && balance >= amt) {
                balance -= amt;
                return true;
            }
            return false;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya", "ACC12345", 1000.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial balance: " + acc.getBalance());
        acc.deposit(500);
        System.out.println("After deposit 500: " + acc.getBalance());
        boolean ok = acc.withdraw(300);
        System.out.println("Withdraw 300 successful: " + ok + ", balance: " + acc.getBalance());
        ok = acc.withdraw(1500);
        System.out.println("Attempt withdraw 1500 successful: " + ok + ", balance: " + acc.getBalance());
        sc.close();
    }
}
