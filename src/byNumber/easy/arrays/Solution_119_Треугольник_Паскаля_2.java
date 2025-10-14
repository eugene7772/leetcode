package byNumber.easy.arrays;

import java.util.ArrayList;
import java.util.List;

//Получение строки Паскаля
public class Solution_119_Треугольник_Паскаля_2 {

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        List<Integer> first = List.of(1, 1);
        if (rowIndex == 1) {
            return first;
        }
        return build(first, rowIndex);
    }

    public static List<Integer> build(List<Integer> next, int rowIndex) {
        List<Integer> result = new ArrayList<>(next.size() + 1);
        result.add(1);
        for (int i = 0; i < next.size() - 1; i++) {
            result.add(next.get(i) + next.get(i + 1));
        }
        result.add(1);
        if (result.size() - 1 == rowIndex) {
            return result;
        }
        return build(result, rowIndex);
    }

    public static List<Integer> getRow2(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int n=rowIndex;
        long val = 1;
        for (int k = 0; k <= n; k++) {
            list.add((int)(val));
            val = val * (n - k) / (k + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
        System.out.println(getRow(1));

        System.out.println(getRow2(3));
        System.out.println(getRow2(1));
    }
}
