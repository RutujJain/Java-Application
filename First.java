public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {"racecar", "hello", "Madam", "A man, a plan, a canal, Panama", "12321"};

        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println("\"" + str + "\" is a palindrome.");
            } else {
                System.out.println("\"" + str + "\" is not a palindrome.");
            }
        }
    }
}