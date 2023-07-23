import java.util.Scanner;

public class ekvebsbp {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int numCount, max=0, min=0, k=0;
        do {
            System.out.print("Girilecek sayi adedi: ");
            numCount = inp.nextInt();
            if (numCount < 3) {
                System.out.println("Lütfen iki veya daha fazla sayı giriniz.");
            }
        } while (numCount < 3);

        for (int i = 1; i<=numCount; i++) {
            System.out.print("Enter the number: ");
            int number = inp.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            } else if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}