package problems;

import java.util.*;

public class Solution_1817_Поиск_активности_по_минутам {

    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> userByUam = new HashMap<>();
        Map<Integer, List<Integer>> timeByUser = new HashMap<>();

        for (int i = 0; i < logs.length; i++) {
            int userId = logs[i][0];
            int time = logs[i][1];
            if (!userByUam.containsKey(userId)) {
                userByUam.put(userId, 1);
                ArrayList<Integer> timesByUser = new ArrayList<>();
                timesByUser.add(time);
                timeByUser.put(userId, timesByUser);
                result[0] += 1;
            } else {
                List<Integer> timesByUser = timeByUser.get(userId);
                if (!timesByUser.contains(time)) {
                    timesByUser.add(time);
                    timeByUser.put(userId, timesByUser);
                    int curUam = userByUam.get(userId);
                    result[curUam - 1] = result[curUam - 1] - 1;
                    curUam++;
                    result[curUam - 1] += 1;
                    userByUam.put(userId, curUam);
                }
            }
        }

        return result;
    }

    public static int[] findingUsersActiveMinutes2(int[][] logs, int k) {
        Map<Integer, Set<Integer>> timeByUser = new HashMap<>();
        for (int[] log : logs) {
            int user = log[0], t = log[1];
            timeByUser.computeIfAbsent(user, u -> new HashSet<>()).add(t);
        }

        int[] res = new int[k];
        for (Set<Integer> minutes : timeByUser.values()) {
            int uam = minutes.size();
            if (uam >= 1 && uam <= k) res[uam - 1]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] r = {{0, 5}, {1, 2,}, {0, 2}, {0, 5}, {1, 3}};
        int[] re = findingUsersActiveMinutes2(r, 5);
        for (int a : re) {
            System.out.println(a);
        }
    }
}
