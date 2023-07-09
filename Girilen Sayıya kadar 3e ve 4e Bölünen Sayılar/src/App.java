import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i, say = 0, top = 0, num;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        num = inp.nextInt();
        inp.close();

        for (i = 1; i <= num; ++i) {
            if ((i %4 == 0) || (i %3 == 0)) {
                say++;
                top += i;
                System.out.println(i);
            }
        }
        ort = top / say;
        System.out.println("Ort = " + ort);
    }
}