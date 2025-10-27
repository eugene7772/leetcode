package problems.arrays.easy;


import java.util.Arrays;

public class Solution_414_Третье_максимальное {

    public static int thirdMax(int[] nums) {
        int[] res = Arrays.stream(nums).sorted().distinct().toArray();
        if(res.length > 2) {
            return res[res.length - 3];
        }
        return res[res.length - 1];
    }

    //Все решают через 3 максимума и возвращают нужный
    public static int thirdMax2(int[] nums) {
        var firstMax = Long.MIN_VALUE;
        var secondMax = Long.MIN_VALUE;
        var thirdMax = Long.MIN_VALUE;
        for (var i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (firstMax == num || secondMax == num || thirdMax == num) {
                continue;
            }
            if (firstMax < num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax < num) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax < num) {
                thirdMax = num;
            }
        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) firstMax;
        }
        return (int) thirdMax;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }
}
