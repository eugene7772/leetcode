package problems.hashTable.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution_202_Happy_Number {
    public static boolean isHappy(int n) {
        return isHappyRecursive(n, new ArrayList<>());
    }

    public static boolean isHappyRecursive(int n, List<Integer> nums) {
        if (n == 1) {
            return true;
        }
        int copy = n;
        List<Integer> arr = new ArrayList<>();
        while (copy != 0) {
            int l = copy % 10;
            copy /= 10;
            arr.add(l);
        }
        int res = 0;
        for (Integer a : arr) {
            res += (int) Math.pow(a, 2);
        }
        if (nums.contains(res)) {
            return false;
        }
        nums.add(res);
        return isHappyRecursive(res, nums);
    }

    //Не мое решение
    public static boolean isHappy2(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappy2(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy2(17));
    }
}
