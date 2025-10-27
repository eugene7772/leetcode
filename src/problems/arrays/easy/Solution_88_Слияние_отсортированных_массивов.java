package problems.arrays.easy;

public class Solution_88_Слияние_отсортированных_массивов {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = nums1.length - 1;
        for (int i = 0; i < nums2.length; i++) {
            int cur = nums2[i];
            int tmp = 0;
            if (cur < nums1[i]) {
                tmp = nums1[i];
                nums1[i] = cur;
            }
            while (j > 0) {
                if (tmp > nums1[j]) {
                    int localTmp = nums1[j];
                    nums1[j] = tmp;
                    nums1[j - (i + 1)] = localTmp;
                    j--;
                    break;
                }
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // последний индекс в nums1 (значимая часть)
        int j = n - 1;      // последний индекс в nums2
        int k = m + n - 1;  // последний индекс итогового массива

        // идём с конца и вставляем наибольшие элементы
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // если в nums2 остались элементы
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 0, 0, 0};
        int[] numbers2 = {2, 5, 6};
        //merge(numbers, 3, numbers2, 3);

        int[] numbers3 = {1};
        int[] numbers4 = {};
        //merge(numbers3, 1, numbers4, 0);

        int[] numbers5 = {0};
        int[] numbers6 = {1};
        //merge(numbers5, 0, numbers6, 1);

        int[] numbers7 = {4, 5, 6, 0, 0, 0};
        int[] numbers8 = {1, 2, 3};
        merge2(numbers7, 3, numbers8, 3);
    }
}
