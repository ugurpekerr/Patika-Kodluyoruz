import java.util.Scanner;

public class asr {
    public static boolean isAsal(int numberx, int bolen) {
        if (numberx < 2) {
            System.out.println("Lütfen 2 veya 2'den büyük sayı giriniz.");
            return false;
        }
        if (numberx == bolen) {
            System.out.println(numberx + " asal sayidir.");
            return true;
        }
        if (numberx % bolen == 0) {
            System.out.println(numberx + " asal sayı degildir.");
            return false;
        }
        return isAsal(numberx, bolen+1);
        }
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int numberx = inp.nextInt();
        System.out.println(isAsal(numberx,2));
        inp.close();
    }
}