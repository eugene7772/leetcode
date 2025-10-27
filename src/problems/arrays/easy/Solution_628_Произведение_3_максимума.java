package problems.arrays.easy;

import java.util.Arrays;

public class Solution_628_Произведение_3_максимума {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        boolean isa = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                isa = true;
            }
        }
        if (!isa) {
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }

        int maxOne = nums[nums.length - 1];
        int maxTwo = nums[nums.length - 2];
        int maxThree = nums[nums.length - 3];

        int maxOfTwo = Math.max(nums[0] * nums[1], maxTwo * maxThree);

        return maxOne * maxOfTwo;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4};
        System.out.println(maximumProduct(nums));
    }
}
