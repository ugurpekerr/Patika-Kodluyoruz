import java.util.Scanner;

public class gdgmo {
    static int geri(int numberx, int count) {
        if (numberx <= count && numberx > 0) {
            System.out.print(numberx + " ");
            return geri(numberx-5, count);
        } else {
            System.out.print(numberx + " ");
            numberx = numberx+5;
            return ileri(numberx, count);
        }
    }
    static int ileri(int numberx, int count) {
        if (numberx <= count && numberx >= 0) {
            System.out.print(numberx + " ");
            return ileri(numberx+5, count);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int numberx = inp.nextInt();
        int count=numberx;
        geri(numberx, count);
        inp.close();
}
}