import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String fileName = "results.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String student = parts[0].trim();
                    int score = Integer.parseInt(parts[1].trim());
                    int total = Integer.parseInt(parts[2].trim());
                    double percentage = ((double) score / total) * 100;
                    System.out.println(student + " scored " + score + " out of " + total + " (" + String.format("%.2f", percentage) + "%)");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading results file: " + e.getMessage());
        }
    }
}
