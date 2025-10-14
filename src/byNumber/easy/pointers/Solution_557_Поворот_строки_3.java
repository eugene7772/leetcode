package byNumber.easy.pointers;

public class Solution_557_Поворот_строки_3 {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = -1;
        for (int i = 0; i <= s.length(); i++) {
            if(i == s.length()) {
                if(start >= 0) {
                    int k = i - 1;
                    while (start < k) {
                        char tmp = s.charAt(start);
                        sb.setCharAt(start, s.charAt(k));
                        sb.setCharAt(k, tmp);
                        start ++;
                        k--;
                    }
                }
                break;
            }
            if(s.charAt(i) != ' ') {
                if(start < 0) {
                    start = i;
                }
            } else {
                if(start >= 0) {
                    int k = i - 1;
                    while (start < k) {
                        char tmp = s.charAt(start);
                        sb.setCharAt(start, s.charAt(k));
                        sb.setCharAt(k, tmp);
                        start ++;
                        k--;
                    }
                    s = sb.toString();
                    start = -1;
                }
            }
        }
        return sb.toString();
    }

    public static String reverseWords2(String s) {
        String[] list = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            res.append(new StringBuilder().append(list[i]).reverse());
            if(i + 1 != list.length) {
                res.append(" ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords2("Mr Ding"));
    }
}
