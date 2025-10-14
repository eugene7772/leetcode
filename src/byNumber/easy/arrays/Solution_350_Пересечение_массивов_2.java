package byNumber.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution_350_Пересечение_массивов_2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        res.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        res.add(nums2[i]);
                        nums1[j] = -1;
                        break;
                    }
                }
            }
        }
        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] nums = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersect(nums, nums2);
    }
}
