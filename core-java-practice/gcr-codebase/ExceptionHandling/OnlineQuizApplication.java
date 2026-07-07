import java.util.Scanner;

class InvalidAnswerException extends Exception {
    public InvalidAnswerException(String message) {
        super(message);
    }
}

public class OnlineQuizApplication {
    public static void main(String[] args) {
        String[] questions = {"2+2= ?", "Capital of France?"};
        String[] answers = {"4", "Paris"};

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String response = sc.nextLine();
            try {
                if (response.isEmpty()) {
                    throw new InvalidAnswerException("Answer cannot be empty.");
                }
                if (response.equalsIgnoreCase(answers[i])) {
                    score++;
                }
            } catch (InvalidAnswerException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        System.out.println("Quiz finished. Score: " + score + "/" + questions.length);
        sc.close();
    }
}
