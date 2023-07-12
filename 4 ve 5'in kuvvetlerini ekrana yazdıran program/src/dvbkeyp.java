import java.util.Scanner;

public class dvbkeyp {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = inp.nextInt();
        
        for (int i = 1, j = 1; i<=n; i*=4, j*=5)
        System.out.println("Dördün katı : " + i + " --- Besin katı : " + j);
        
        inp.close();
    }
}