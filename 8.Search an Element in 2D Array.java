import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                if (array[i][j] == target) {
                    System.out.println("Number found at position: (" + i + ", " + j + ")");
                    found = true;
                    break; 
                }
            }
            if (found) break; 
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        scanner.close();
    }
}