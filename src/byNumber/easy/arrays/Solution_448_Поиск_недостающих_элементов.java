package byNumber.easy.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class Solution_448_Поиск_недостающих_элементов {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>(IntStream.rangeClosed(1, nums.length).boxed().toList());
        for (int num : nums) {
            int idx = result.indexOf(num);     // 1, либо -1 если нет
            if (idx >= 0) {
                Integer val = result.get(idx);
                System.out.println(val);
                result.remove(idx);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums.length;

        // Помечаем по значению
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);      // берём абсолют — элемент мог быть уже помечен
            int idx = x - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];     // помечаем
            }
        }

        // Положительные позиции — пропавшие числа
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                missing.add(i + 1);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
