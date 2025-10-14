package byNumber.medium.arrays;

public class Solution2079_Полив_растений {

    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 1;
        int full = capacity;
        for (int i = 0; i < plants.length; i++) {
            int reminder = capacity - plants[i];
            capacity = reminder;
            if(i + 1 != plants.length) {
                if(reminder < plants[i + 1]) {
                    steps += i + i + 3;
                    capacity = full;
                } else {
                    steps++;
                }
            }
        }
        return steps;
    }

    public int wateringPlants2(int[] plants, int capacity) {
        int steps = 0;
        int can = capacity;

        for(int i = 0; i < plants.length; i++){
            if(plants[i] <= can){
                can = can - plants[i];
                steps++;
            }else{
                steps += (i * 2) + 1;
                can = capacity;
                can = can - plants[i];
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        int[] plants = {7,7,7,7,7,7,7};
        System.out.println(wateringPlants(plants, 8));
    }
}
