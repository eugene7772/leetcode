package problems.pointers.easy;

public class Solution_922_Четные_нечетные {

    public static int[] sortArrayByParityII(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if(nums[i] % 2 == 0) {
                    i++;
                    j++;
                }
            } else {
                if(nums[i] % 2 == 0) {

                }
            }
        }

        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        sortArrayByParityII(nums);
    }
}
