package problems.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution_349_Пересечение_массивов {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<>();
        for (int a: nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if(a == nums2[i]) {
                    resSet.add(a);
                }
            }
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for (int a : resSet) {
            res[i] = a;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {


    }

}
