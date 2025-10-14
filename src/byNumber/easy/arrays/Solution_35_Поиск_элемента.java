package byNumber.easy.arrays;

public class Solution_35_Поиск_элемента {
    public static int searchInsert(int[] nums, int target) {
        int notFoundIndex = 0;
        int foundIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                foundIndex = i;
            }
            if (target > nums[i]) {
                notFoundIndex = i + 1;
            }
        }
        if (foundIndex == 0) {
            return notFoundIndex;
        } else {
            return foundIndex;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        System.out.println(searchInsert(numbers, 5));
        System.out.println(searchInsert(numbers, 2));
        System.out.println(searchInsert(numbers, 7));
    }
}
