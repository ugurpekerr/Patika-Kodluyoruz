import java.util.Scanner;

public class Mtvp {
    public static void main(String[] args) throws Exception {
        int matrix[][] = new int[2][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("a" + row + column + ":");
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("---------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        int row = 0;
        for (int k = 0; k <= matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = row; j <= matrix.length;) {
                    System.out.print(matrix[i][j] + " ");
                    break;
                }
            }
            System.out.println();
            row++;
        }
        input.close();
    }
}