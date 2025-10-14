package byNumber.easy.arrays;

public class Solution_268_Поиск_пропущенного_числа {

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length * (nums.length + 1) / 2;
        return n - sum;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int f = x ^ y;
        System.out.println(f);
    }
}
