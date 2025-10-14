package byNumber.easy.pointers;

public class Solution_942_DI_перестановки {

    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n + 1];

        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                res[i] = low++;
            } else {
                res[i] = high--;
            }
        }
        res[n] = low;
        return res;
    }


    public static void main(String[] args) {
        diStringMatch("IDID");
    }
}
