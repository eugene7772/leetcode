package byNumber.easy.arrays;

import java.util.Arrays;

public class Solution_217_Проверка_на_дубликаты_в_массиве {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return false;
            }
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            if (j >= 0 && nums[j] == key) {
                return true;
            }
            nums[j + 1] = key;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate2(nums));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3));
    }
}
