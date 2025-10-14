package byNumber.easy.arrays;

public class Solution_605_Посадка_цветов {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 1) {
                return n == 0;
            } else {
                n--;
                return n == 0;
            }
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        for(int i = 0; i<flowerbed.length;i= i+2){
            if(flowerbed[i]==0){
                if(i == flowerbed.length-1|| flowerbed[i]==flowerbed[i+1]){
                    n--;

                }else{
                    i++;
                }
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        int[] a = {0, 1};
        System.out.println(canPlaceFlowers2(a, 1));
    }
}
