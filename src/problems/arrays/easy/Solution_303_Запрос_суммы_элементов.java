package problems.arrays.easy;


public class Solution_303_Запрос_суммы_элементов {

    static class NumArray {
        int[] prefix; // длина n+1

        public NumArray(int[] nums) {
            prefix = new int[nums.length + 1]; // prefix[0] = 0
            for (int i = 1; i <= nums.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            // сумма на [left..right]
            return prefix[right + 1] - prefix[left];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int left = 0;
        int right = 2;
        int param_1 = obj.sumRange(left,right);
        System.out.println(param_1);
    }

}
