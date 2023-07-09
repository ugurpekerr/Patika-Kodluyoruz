import java.util.Scanner;

public class cvdktp {
    public static void main(String[] args) throws Exception {
        
        int i, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            i = inp.nextInt();
                if (i %4 == 0) {
                    total += i;
                } else if (i %2 != 0) {
                    break;
                }
        } while (i > 0);
            System.out.println("Toplam : " + total);
    }
}