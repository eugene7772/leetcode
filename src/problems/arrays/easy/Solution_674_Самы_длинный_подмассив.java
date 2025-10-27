package problems.arrays.easy;

public class Solution_674_Самы_длинный_подмассив {

    public static int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int cur = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] > nums[i]) {
                cur++;
            } else {
                res = Math.max(cur, res);
                cur = 1;
            }
        }
        return Math.max(cur, res);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }
}
