public class App {
    public static void main(String[] args) {
        int[][] array = {
            {3, 8, 1},
            {14, 5, 9},
            {7, 2, 6}
        };
        int min = array[0][0];
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                if (array[i][j] < min) {
                    min = array[i][j]; 
                }
                if (array[i][j] > max) {
                    max = array[i][j]
                }
            }
        }
        System.out.println("Smallest element in the 2D array: " + min);
        System.out.println("Largest element in the 2D array: " + max);
    }
}