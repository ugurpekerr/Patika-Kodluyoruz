import java.util.Scanner;
public class HesapMakinesi {
    //
    public static void main(String[] args) throws Exception {
        double n1, n2, answer;
        int select;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n1 = inp.nextDouble();
        System.out.print("Bir Sayı Giriniz : ");
        n2 = inp.nextDouble();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nBir islem türü seçiniz : ");
        select = inp.nextInt();
        switch (select) {
            case 1:
                answer = (n1 + n2);
                System.out.println("Islem Sonucu : " + answer);
                break;
            case 2:
                answer = (n1 - n2);
                System.out.println("Islem Sonucu : " + answer);
                break;
            case 3: 
                answer = (n1 * n2);
                System.out.println("Islem Sonucu : " + answer);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Islem Sonucu : " + (n1/n2));
                }else{
                    System.out.println("Tanımsız");
                }
                break;
            default:
                System.out.println("Lütfen 1 ile 4 arasında bir sayı giriniz!");
                break;
        }
    inp.close();
    }
}
