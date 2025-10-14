package byNumber.easy.pointers;

public class Solution_28_Вхождение_строки {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int pos = -1;

        int i = 0;
        int j = 0;

        while (i < haystack.length()) {
            String haystackChar = haystack.substring(i, i + 1);
            String needleChar = needle.substring(j, j + 1);
            if (needleChar.equals(haystackChar)) {
                if(j == 0) {
                    pos = i;
                }
                i++;
                j++;
                if (j == needle.length()) {
                    return pos;
                }
            } else {
                if (j > 0) {
                    i = pos + 1;
                    j = 0;
                    pos = -1;
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            String a = haystack.substring(i, i + n);
            if (a.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sabutsad";
        String needle = "sad";
        System.out.println(strStr2(haystack, needle));
    }
}
