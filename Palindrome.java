public class Palindrome {
    private String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome("A man, a plan, a canal: Panama");
        if (palindrome.isPalindrome()) {
            System.out.println("\"" + palindrome.text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + palindrome.text + "\" is not a palindrome.");
        }
    }
}
