package problems.string.easy;

public class Solution_13_Греческие_числа {
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char prevChar = ' ';
            if (s.length() > i + 1) {
                prevChar = s.charAt(i + 1);
            }
            if (s.charAt(i) == prevChar) {
                num = num + val(s.charAt(i + 1));
                continue;
            }
            int curNum = val(s.charAt(i));
            if (curNum > num) {
                num += curNum;
            } else {
                num -= curNum;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt2("III"));
    }

    public static int romanToInt2(String s) {
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = val(s.charAt(i));
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }
            prev = curr;
        }
        return total;
    }

    private static int val(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman char: " + c);
        };
    }
}
