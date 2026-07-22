import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ConfigBracketValidator {
    public static boolean isValidConfig(String config) {
        Deque<Character> stack = new ArrayDeque<>(); Map<Character, Character> openFor = Map.of(')', '(', ']', '[', '}', '{');
        for (char c : config.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (openFor.containsKey(c) && (stack.isEmpty() || stack.pop() != openFor.get(c))) return false;
        }
        return stack.isEmpty();
    }
}
