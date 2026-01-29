package Practice_1;

public class Pb_6 {

    static boolean isPalindrome(String text) {

        int length = text.length();

        for (int i = 0; i < length / 2; i++) {

            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
