import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        /* 0 + 1 = 1, 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8, 5 + 8 = 13, 8 + 13 = 21, 13 + 21 = 34 */

        Scanner inp = new Scanner(System.in);
        System.out.print("Kac tane Fibonacci Seri sayısını görmek istiyorsunuz: ");
        int number = inp.nextInt();
        int numberOne = 0, numberTwo = 1;

        for (int i=0; i<number; i++) {
            if (number==1) {
                System.out.println(numberOne+numberTwo);
            } else {
            int total = numberOne+numberTwo;
            System.out.print(total + " ");
            numberOne = numberTwo;
            numberTwo = total;
            }
        }
    }
}


