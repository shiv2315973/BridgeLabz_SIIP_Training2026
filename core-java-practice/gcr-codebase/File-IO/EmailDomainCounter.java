import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmailDomainCounter {
    public static void main(String[] args) {
        String fileName = "emails.txt";
        Map<String, Integer> domainCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String email = line.trim();
                if (email.contains("@")) {
                    String domain = email.substring(email.indexOf("@") + 1).toLowerCase();
                    domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
                }
            }
            for (Map.Entry<String, Integer> entry : domainCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error reading email file: " + e.getMessage());
        }
    }
}
