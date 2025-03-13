public class App{
    public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // Sum of each row
    for (int i = 0; i < array.length; i++) {
    int rowSum = 0;
    for (int element : array[i]) {
    rowSum += element;
    }
    System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
    }
    // Sum of each column
    for (int j = 0; j < array[0].length; j++) {
    int colSum = 0;
    for (int[] row : array) {
    colSum += row[j];
    }
    System.out.println("Sum of column " + (j + 1) + ": " + colSum);
    }
    }
    }