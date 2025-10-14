package byNumber.easy.arrays;

public class Solution_14_Самый_длинный_префикс {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Начинаем с первого слова как с префикса
        String prefix = strs[0];

        // Сравниваем его с остальными словами
        for (int i = 1; i < strs.length; i++) {
            // Пока текущее слово не начинается с prefix – сокращаем prefix
            while (!strs[i].startsWith(prefix)) {
                boolean a = strs[i].startsWith(prefix);
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs1)); // fl
        System.out.println(longestCommonPrefix(strs2)); // ""
    }
}
