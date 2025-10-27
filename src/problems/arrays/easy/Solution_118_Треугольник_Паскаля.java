package problems.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//На вход идет число строк на выходе матрица Паскаля
public class Solution_118_Треугольник_Паскаля {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        if (numRows == 1) {
            return result;
        }

        List<Integer> tmp = List.of(1, 1);
        result.add(tmp);

        for (int i = 2; i < numRows; i++) {
            List<Integer> local = new ArrayList<>();
            local.add(1);
            for (int j = 0; j < tmp.size() - 1; j++) {
                local.add(tmp.get(j) + tmp.get(j + 1));
            }
            local.add(1);
            tmp = local;
            result.add(tmp);
        }
        return result;
    }

    public static List<List<Integer>> generate2(int n) {
        List<List<Integer>> res = new ArrayList<>(n);
        List<Integer> prev = new ArrayList<>(1);
        prev.add(1);
        res.add(prev);

        for (int i = 2; i <= n; i++) {
            List<Integer> cur = new ArrayList<>(i);
            cur.add(1);
            for (int j = 1; j < i - 1; j++) {
                cur.add(prev.get(j - 1) + prev.get(j));
            }
            if (i > 1) cur.add(1);
            res.add(cur);
            prev = cur;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));

        System.out.println(generate2(5));
        System.out.println(generate2(1));
    }
}
