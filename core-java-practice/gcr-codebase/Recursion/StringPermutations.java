import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void permute(String prefix, String remaining, List<String> results) {
        if (remaining.isEmpty()) {
            results.add(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), results);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> results = new ArrayList<>();
        permute("", input, results);
        System.out.println("Permutations of " + input + ":");
        for (String permutation : results) {
            System.out.println(permutation);
        }
    }
}
