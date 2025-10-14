package byNumber.easy.arrays;

public class Solution_169_Элемент_большенства {

    public static int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        for (int v : nums) {
            if (count == 0) {
                major = v;
                count = 1;
            } else if (v == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums2 = {3, 2, 3};
        System.out.println(majorityElement(nums2));

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
