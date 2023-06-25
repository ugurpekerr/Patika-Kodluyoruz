import java.util.Scanner;

public class kdv {
    public static void main(String[] args) throws Exception {
        double fiyat, kdv;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Fiyatı giriniz : ");
        fiyat = inp.nextDouble();

        kdv = (fiyat<1000 && fiyat >0 ? 0.18 : 0.08);
        double kdvliFiyat = fiyat + (fiyat * kdv);
        System.out.println("Kdvsiz fiyat: " + fiyat);
        System.out.println("Kdv Oranı:%" + kdv*100);
        System.out.println("Kdvli fiyat: " + kdvliFiyat);
        inp.close();
    }
}
