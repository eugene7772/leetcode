package problems.arrays.easy;

public class Solution_136_Еденичное_число {

    public static int singleNumber(int[] nums) {
        int x = 0;
        for (int v : nums) {
            x ^= v;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums2));

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // true (оба из кеша)
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d); // false (созданы новые объекты)
    }
}
