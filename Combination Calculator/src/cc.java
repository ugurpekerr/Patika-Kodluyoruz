import java.util.Scanner;

public class cc {
    public static void main(String[] args) throws Exception {

    /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)*/
    
        Scanner inp = new Scanner(System.in);
        int firstNumber, secondNumber, c;
        int facn = 1, facr = 1, facx = 1;
        System.out.print("n sayısını giriniz : ");
        firstNumber = inp.nextInt();

        System.out.print("r sayısını giriniz : ");
        secondNumber = inp.nextInt();

        for (int n = 1; n <= firstNumber; n++) {
            facn = facn * n;
        }
        for (int r = 1; r <= secondNumber; r++) {
            facr = facr * r;
        }
        int y = firstNumber - secondNumber;
        for (int x = 1; x <= y; x++) {
            facx = facx * x;
        }
        c = facn / (facr * facx);
        System.out.println("C(n,r) = " + c);
        inp.close();
    }
}        