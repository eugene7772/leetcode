package problems.pointers.easy;

public class Solution_541_Переворот_строки_2 {
    public static String reverseStr(String s, int k) {
        int l = k;
        if (s.length() <= k) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean isReverse = true;
            while (i < s.length()) {
                int count2 = s.length() - i;
                if (count2 < l) {
                    String sd = s.substring(i, s.length());
                    StringBuilder dasd = new StringBuilder(sd);
                    if (isReverse) {
                        sb.append(dasd.reverse());
                    } else {
                        sb.append(sd);
                    }
                    return sb.toString();
                }
                String subStr = s.substring(i, k);
                if (isReverse) {
                    StringBuilder sbRev = new StringBuilder(subStr);
                    subStr = sbRev.reverse().toString();
                    isReverse = false;
                } else {
                    isReverse = true;
                }
                sb.append(subStr);
                k = k + l;
                i = i + l;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }
}
