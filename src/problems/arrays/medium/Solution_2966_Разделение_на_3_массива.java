package problems.arrays.medium;

import java.util.Arrays;

public class Solution_2966_Разделение_на_3_массива {

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[nums.length / 3][3];
        int j = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i ++) {
            if(i > 0 && i % 3 == 0) {
                j++;
                l=0;
            }
            if(l == 0) {
                if(i + 1 != nums.length) {
                    if (Math.abs(nums[i] - nums[i + 1]) > k) {
                        return new int[0][0];
                    }
                }
                if(i + 2 < nums.length) {
                    if(Math.abs(nums[i] - nums[i + 2]) > k || Math.abs(nums[i + 1] - nums[i + 2]) > k) {
                        return new int[0][0];
                    }
                }
            }
            res[j][l] = nums[i];
            l++;
        }
        return res;
    }

    public static int[][] divideArray2(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n / 3][3];

        for (int i = 0; i < n; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }
            result[i / 3][0] = nums[i];
            result[i / 3][1] = nums[i + 1];
            result[i / 3][2] = nums[i + 2];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,7,9,10,11};
        divideArray2(nums, 2);
    }
}
