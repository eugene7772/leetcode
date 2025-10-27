package problems.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution_228_Сводные_диапазоны {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int firstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && firstIndex < 0) {
                result.add(String.valueOf(nums[i]));
                break;
            } else if (i == nums.length - 1 && firstIndex >= 0) {
                result.add(nums[firstIndex] + "->" + nums[i]);
                break;
            }
            if (Math.abs(nums[i] - nums[i + 1]) == 1) {
                if (firstIndex < 0) {
                    firstIndex = i;
                }
            } else if (firstIndex >= 0) {
                result.add(nums[firstIndex] + "->" + nums[i]);
                firstIndex = -1;
            } else {
                result.add(String.valueOf(nums[i]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        //System.out.println(summaryRanges(nums));
        int[] nums2 = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums2));
    }
}
