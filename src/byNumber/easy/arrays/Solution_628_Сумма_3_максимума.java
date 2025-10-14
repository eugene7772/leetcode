package byNumber.easy.arrays;

public class Solution_628_Сумма_3_максимума {
    public static int maximumProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    int max = a * b * c;
                    res = Math.max(res, max);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }
}
