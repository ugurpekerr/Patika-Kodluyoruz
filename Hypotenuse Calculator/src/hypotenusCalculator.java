import java.util.Scanner;

public class hypotenusCalculator {
    public static void main(String[] args) throws Exception {
        double a, b, c, u, alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz : ");
        a = girdi.nextDouble();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = girdi.nextDouble();
        System.out.print("Üçüncü Kenarı Giriniz : ");
        c = girdi.nextDouble();
        
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan :" + alan);
        System.out.println("Çevre :" + 2*u);
        girdi.close();
    }
}