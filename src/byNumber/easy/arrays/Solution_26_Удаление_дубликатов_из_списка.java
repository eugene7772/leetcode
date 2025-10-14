package byNumber.easy.arrays;

public class Solution_26_Удаление_дубликатов_из_списка {

    //Мое решение
    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return 1;
        }

        int curValue = nums[0];

        int nextIndex = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (curValue != nums[i]) {
                nums[nextIndex] = nums[i];
                nextIndex++;
                curValue = nums[i];
            }
        }
        return nextIndex;
    }

    //Лучшее решение
    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2};
        removeDuplicates(numbers);
        int[] numbers2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(numbers2);
    }
}
