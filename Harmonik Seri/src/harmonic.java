import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        double top = 0;

        for (double i = 1; i <= n; i++) {
            top += (1/i);
        }
        System.out.println(top);
        inp.close();
    }
}