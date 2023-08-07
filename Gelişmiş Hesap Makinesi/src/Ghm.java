import java.util.Scanner;

public class Ghm {
    static int sum(int a , int b) {
        int result = a + b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int minus(int a , int b) {
        int result = a - b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int times(int a , int b) {
        int result = a * b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int div(int a , int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int mod(int a , int b) {
        int result = a % b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int alan(int a , int b) {
        int alan = a * b;
        int cevre = 2*(a + b);
        System.out.println("Alan: " + alan + "\nCevre :" + cevre);
        return 1;
    }
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Çıkarma Islemi\n"
                + "3- Çarpma Islemi\n"
                + "4- Bölme islemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkıs Yap";
        
        System.out.println(menu);
        while (true) {
        System.out.print("Bir islem seciniz: ");
        select = inp.nextInt();

        if (select == 0) {
            break;
        }

        System.out.print("Ilk sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.print("Ikinici sayıyı giriniz: ");
        int b = inp.nextInt();

        switch (select) {
            case 1:
                sum(a,b);
                break;
            case 2:
                minus(a, b);
                break;
            case 3:
                times(a, b);
                break;
            case 4:
                if (div(a, b) == 0) {
                    System.out.println("Tanımsız");  
                    break;
                }
                div(a, b);
                break;
            case 5:
                power(a, b);
                break;
            case 6:
                fac(a);
                break;
            case 7:
                mod(a, b);
                break;
            case 8:
                alan(a, b);
                break;
            default:
                break;
        }
        }
        inp.close();
        System.out.println("Byeee! Byesssssss!");
    }
}
