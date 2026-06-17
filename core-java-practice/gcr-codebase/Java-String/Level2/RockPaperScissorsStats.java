import java.util.Scanner;

public class RockPaperScissorsStats {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        }
        return "scissors";
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                || (userChoice.equals("paper") && computerChoice.equals("rock"))
                || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static String[][] findStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(Math.round((userWins * 10000.0) / games) / 100.0);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(Math.round((computerWins * 10000.0) / games) / 100.0);

        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t"
                    + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("Player\t\tWins\tWin Percentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();
        String[][] gameResults = new String[games][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter rock, paper, or scissors for game " + (i + 1) + ": ");
            String userChoice = input.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = findStats(userWins, computerWins, games);
        displayResults(gameResults, stats);

        input.close();
    }
}
