import java.util.Arrays;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        int required = t.length();
        int left = 0;
        int bestStart = -1;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (need[ch] > 0) {
                required--;
            }
            need[ch]--;

            while (required == 0) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;
                if (need[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return bestStart == -1 ? "" : s.substring(bestStart, bestStart + bestLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Minimum window: " + minWindow(s, t));
    }
}
