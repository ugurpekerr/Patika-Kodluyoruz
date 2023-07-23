import java.util.Scanner;

public class ekvebsbp {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = inp.nextInt();
        System.out.print("Sayı giriniz: ");
        int b = inp.nextInt();
        System.out.print("Sayı giriniz: ");
        int c = inp.nextInt();
        System.out.print("Sayı giriniz: ");
        int d = inp.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println("En büyük sayi: " + a);
        } else if (b > a && b > c && b > d) {
            System.out.println("En büyük sayi: " + b);
        } else if (c > a && c > a && c > d) {
            System.out.println("En büyük sayi: " + c);
        } else if (d > a && d > b && d > c) {
            System.out.println("En büyük sayi: " + d);
        }

        if (a < b && a < c && a < d) {
            System.out.println("En kucuk sayi: " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("En kucuk sayi: " + b);
        } else if (c < a && c < a && c < d) {
            System.out.println("En kucuk sayi: " + c);
        } else if (d < a && d < b && d < c) {
            System.out.println("En kucuk sayi: " + d);
        }
    }
}