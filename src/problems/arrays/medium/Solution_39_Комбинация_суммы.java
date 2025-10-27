package problems.arrays.medium;

import java.util.*;

public class Solution_39_Комбинация_суммы {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, path, res);
        return res;
    }

    private static void dfs(int[] nums, int start, int remain, Deque<Integer> path, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            int x = nums[i];
            if (x > remain) break;
            path.addLast(x);
            dfs(nums, i, remain - x, path, res);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        System.out.println(combinationSum(candidates, 7));
    }
}
