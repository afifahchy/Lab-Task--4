public class App {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < i; j++)
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("The matrix is not symmetric");
                    return;
                }

        System.out.println("The matrix is symmetric");
    }
}