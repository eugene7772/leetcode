package problems.pointers.easy;

public class Solution_344_Поворот_строки {

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i<j) {
            char tmp = s[j];
            s[j] = s[i];
            s[i] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

    }
}
