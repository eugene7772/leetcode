package problems.arrays.easy;

public class Solution_66_Инкеремент_массива {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9};
        int[] res1 = plusOne(numbers);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i]);
        }
        System.out.println();
        int[] numbers2 = {4, 3, 2, 1};
        int[] res2 = plusOne(numbers2);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i]);
        }
        System.out.println();
        int[] numbers3 = {9};
        int[] res3 = plusOne(numbers3);
        for (int i = 0; i < res3.length; i++) {
            System.out.print(res3[i]);
        }
    }
}
