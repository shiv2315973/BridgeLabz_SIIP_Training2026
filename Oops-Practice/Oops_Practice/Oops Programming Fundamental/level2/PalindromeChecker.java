public class PalindromeChecker {
    static class Checker {
        private String text;

        public Checker(String text) {
            this.text = text;
        }

        public boolean isPalindrome() {
            String s = text.replaceAll("\\s+", "").toLowerCase();
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++; j--;
            }
            return true;
        }

        public void display() {
            System.out.println("Text: " + text);
            System.out.println("Is palindrome: " + isPalindrome());
        }
    }

    public static void main(String[] args) {
        Checker c1 = new Checker("Madam");
        c1.display();
        Checker c2 = new Checker("Hello");
        c2.display();
    }
}
