package problems.pointers.easy;

public class Solution_125_Валидный_полиндром {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));

        String s2 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s2));
    }
}
