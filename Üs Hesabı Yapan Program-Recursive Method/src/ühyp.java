import java.util.Scanner;

public class ühyp {
    static int power(int k, int l) {
        if (l!=0) {
            return (k*power(k, l-1));
        } else {
            return 1;
        }
            
}
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz : ");
        int k = inp.nextInt();
        System.out.print("Üs Degerini Giriniz : ");
        int l = inp.nextInt();
        System.out.println(k + "^" + l + "=" + power(k, l));
        inp.close();
    }
}