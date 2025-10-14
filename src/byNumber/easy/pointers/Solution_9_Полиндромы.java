package byNumber.easy.pointers;

import java.util.ArrayList;
import java.util.List;

public class Solution_9_Полиндромы {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1421));
        System.out.println(isPalindrome(4224));
        System.out.println(isPalindrome(13));
        System.out.println(isPalindrome(12133));
    }

    //Мое решение
    public static boolean isPalindrome(int x) {
        int copy = x;
        if(x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        List<Integer> inverseList = new ArrayList<>();
        while (x != 0) {
            int remainder = x % 10;
            inverseList.add(remainder);
            x = x / 10;
        }
        double inverse = 0;
        double multipier = Math.pow(10,inverseList.size() -1);
        for (int a: inverseList) {
            inverse = inverse + (a * multipier);
            multipier = multipier / 10;
        }
        if (copy == inverse) {
            return true;
        }
        return false;
    }

    //Правильное решение
    public static boolean isPalindrome2(int x) {
        // Шаг 1: Обработка отрицательных чисел
        if (x < 0) {
            return false;
        }

        int originalNumber = x;
        int reversedNumber = 0;

        // Шаг 3 и 4: Извлечение цифр и построение перевернутого числа
        while (x > 0) {
            int digit = x % 10; // Извлекаем последнюю цифру
            reversedNumber = reversedNumber * 10 + digit; // Добавляем цифру в перевернутое число
            x /= 10; // Удаляем последнюю цифру из исходного числа
        }

        // Шаг 5: Сравнение перевернутого числа с исходным
        return originalNumber == reversedNumber;
    }
}
