package byNumber.easy.pointers;

public class Solution_832_Переворачивание_изображения {

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image[i].length - 1;
            while (j <= k) {
                int tmp = image[i][k];
                image[i][k] = image[i][j];
                image[i][j] = tmp;
                j++;
                k--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(image);
    }
}
