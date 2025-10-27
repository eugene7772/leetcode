package problems.pointers.easy;

public class Solution_905_Сортировка_четных_нечетных {

    public static int[] sortArrayByParity(int[] nums) {
        int j = nums.length - 1;
        for (int k = 0; k < nums.length; k++) {
            if(nums[k] % 2 != 0) {
                while (k<j) {
                    if(nums[j] % 2 == 0) {
                        int tmp = nums[j];
                        nums[j] = nums[k];
                        nums[k] = tmp;
                        break;
                    }
                    j--;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
    }
}
