package byNumber.easy.arrays;

public class Solution_744_Наименьший_символ_больше_таргеа {

    public static char nextGreatestLetter(char[] letters, char target) {
        char smallest = letters[0];
        char bigSmall = 'z';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target && letters[i] <= bigSmall) {
                smallest = letters[i];
                bigSmall = smallest;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        char[] a = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(a, 'c'));
    }
}
