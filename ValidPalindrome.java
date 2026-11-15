public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isValidPalindrome(s);
        System.out.println(result);
    }

    public static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;

    }

}