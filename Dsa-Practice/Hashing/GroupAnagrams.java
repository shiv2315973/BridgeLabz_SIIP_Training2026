import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray(); Arrays.sort(letters);
            groups.computeIfAbsent(new String(letters), key -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
