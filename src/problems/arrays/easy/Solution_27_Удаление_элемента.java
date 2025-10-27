package problems.arrays.easy;

public class Solution_27_Удаление_элемента {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        return k;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 2, 3};
        //System.out.println(removeElement(numbers, 3));
        int[] numbers2 = {0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(numbers2, 2);
    }
}
