import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        String fileName = "feedback.txt";
        int positiveCount = 0;
        int negativeCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String feedback = line.trim().toLowerCase();
                if (feedback.contains("good") || feedback.contains("great") || feedback.contains("excellent") || feedback.contains("happy")) {
                    positiveCount++;
                } else if (feedback.contains("bad") || feedback.contains("poor") || feedback.contains("slow") || feedback.contains("disappointed")) {
                    negativeCount++;
                }
            }
            System.out.println("Positive feedback count: " + positiveCount);
            System.out.println("Negative feedback count: " + negativeCount);
        } catch (IOException e) {
            System.out.println("Error reading feedback file: " + e.getMessage());
        }
    }
}
