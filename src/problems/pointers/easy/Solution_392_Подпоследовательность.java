package problems.pointers.easy;

public class Solution_392_Подпоследовательность {

    public static boolean isSubsequence(String s, String t) {
        if(s.isBlank()) {
            return true;
        }
        if(s.length()> t.length()) {
            return false;
        }
        int i = 0;
        int l = 0;
        int j = t.length() - 1;
        int k = s.length() - 1;

        int res = s.length();

        while (i <= j) {
            if(t.charAt(i) == s.charAt(l)) {
                res--;
                i++;
                l++;
                if(res == 0) {
                    break;
                }
            } else {
                i++;
            }
            if(l == j) {
                break;
            }
            if(t.charAt(j) == s.charAt(k)) {
                res--;
                j--;
                k--;
                if(res == 0) {
                    break;
                }
            } else {
                j--;
            }
        }

        return res == 0;
    }

    //Не мое решение
    public boolean isSubsequence2(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("aza", "abzba"));
        System.out.println(isSubsequence("abbc", "ahbdc"));
        System.out.println(isSubsequence("aa", "a"));
    }
}
