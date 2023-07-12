import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) throws Exception {
        //3^4=3*3*3*3 ---- n^k = n*n*n*n...
        double n, k, total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = inp.nextDouble();
        System.out.print("k sayısını giriniz : ");
        k = inp.nextDouble();

        for (double i = 1; i <= k; i++){
            total*=n;
        }
        System.out.println(total);
        inp.close();
    }
}
