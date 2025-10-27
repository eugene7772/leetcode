package problems.arrays.easy;

public class Solution_283_Перестанова_0_в_конец {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i == nums.length - 1) {
                    return;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes2(nums);

        int[] nums2 = {0};
        moveZeroes(nums2);
    }
}
