import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    public static void generateSubsets(String input, int index, String current, List<String> subsets) {
        if (index == input.length()) {
            subsets.add(current);
            return;
        }
        generateSubsets(input, index + 1, current, subsets);
        generateSubsets(input, index + 1, current + input.charAt(index), subsets);
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> subsets = new ArrayList<>();
        generateSubsets(input, 0, "", subsets);
        System.out.println("Subsets of " + input + ":");
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }
}
