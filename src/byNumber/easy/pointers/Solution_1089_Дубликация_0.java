package byNumber.easy.pointers;

public class Solution_1089_Дубликация_0 {
    public static void duplicateZeros(int[] arr) {
        int[] copy = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(j == arr.length) {
                break;
            }
            copy[j] = arr[i];
            if(j == arr.length - 1) {
                break;
            }
            if (arr[i] == 0) {
                j++;
            }
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,5,2,0,6,8,0,6,0};
        duplicateZeros(a);
    }
}
