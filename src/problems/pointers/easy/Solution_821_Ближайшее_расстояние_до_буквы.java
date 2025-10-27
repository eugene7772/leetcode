package problems.pointers.easy;

import java.util.Arrays;

public class Solution_821_Ближайшее_расстояние_до_буквы {

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);

        // нули на позициях символа c
        for (int k = 0; k < n; k++) {
            if (s.charAt(k) == c) res[k] = 0;
        }

        int le = -1;
        int re = -1;

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (s.charAt(i) == c) le = i;
            if (le != -1) {
                res[i] = Math.min(res[i], i - le);
            }

            if (s.charAt(j) == c) re = j;
            if (re != -1) {
                res[j] = Math.min(res[j], re - j);
            }
        }

        return res;
    }

    public static int[] shortestToChar2(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        Arrays.fill(res, n + 1); // “бесконечность” побольше длины строки

        // слева направо: расстояние до ближайшего 'c' слева
        int last = -n - 1; // далеко слева
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) last = i;
            res[i] = Math.min(res[i], i - last);
        }

        // справа налево: расстояние до ближайшего 'c' справа
        last = 2 * n + 1; // далеко справа
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) last = i;
            res[i] = Math.min(res[i], last - i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode", 'e');
        for (int a : res) {
            System.out.print(a);
        }
    }
}
