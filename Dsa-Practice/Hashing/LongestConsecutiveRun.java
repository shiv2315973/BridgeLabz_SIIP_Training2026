import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveRun {
    public int longestConsecutiveRun(int[] ids) {
        Set<Integer> values = new HashSet<>(); for (int id : ids) values.add(id);
        int longest = 0;
        for (int value : values) if (!values.contains(value - 1)) {
            int current = value, length = 1;
            while (values.contains(++current)) length++;
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
