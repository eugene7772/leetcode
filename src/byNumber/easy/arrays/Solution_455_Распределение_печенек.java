package byNumber.easy.arrays;

import java.util.*;

public class Solution_455_Распределение_печенек {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int content = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                content++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return content;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 2};
        System.out.println(findContentChildren(g, s));
    }
}
