package byNumber.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution_219_Проверка_на_дубликаты_в_массиве_2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums, 3));

        int[] nums2 = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums2, 1));
    }
}
