import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int distance, age, travelType;
        double cost = 0.1, a = 0.5, b = 0.1, c = 0.3, d = 0.2;
        
        //cost = mesafe başına ücret miktarı = 0.10 TL/km

        /*a = 12 yaş indirimi %50, b = 12-24 yaş arası indirim %10
        c = 65 yaş inidirimi %30, d = gidiş dönüş indirimi %20*/
        
        System.out.print("Lütfen mesafeyi km olarak giriniz : ");
        distance = inp.nextInt();
        System.out.print("Lütfen yasınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Lütfen seyahat türünü seçiniz (1-tek yön, 2-Gidiş Dönüş) : ");
        travelType = inp.nextInt();
        
        double normalTutar = distance*cost; 
        double kucukOnIki = normalTutar-normalTutar*a;
        double onIkiYirmiDort = normalTutar-normalTutar*b;
        double atmısBesYas = normalTutar-normalTutar*c;

        if (distance > 0 && age > 0 && travelType == 1 || travelType == 2) {
            if (age < 12) {
                if (travelType == 1) {
                    System.out.print("Toplam Tutar = " + kucukOnIki + " TL");
                } else {
                    System.out.print("Toplam Tutar = " + (kucukOnIki-kucukOnIki*d)*2 + " TL");
                }
            } else if (age >= 12 && age <= 24) {
                if (travelType == 1) {
                    System.out.println("Toplam Tutar = " + onIkiYirmiDort + " TL");
                } else {
                    System.out.println("Toplam Tutar = " + (onIkiYirmiDort-onIkiYirmiDort*d)*2 + " TL");
                }
            } else if (age > 24 && age < 65) {
                if (travelType == 1) {
                    System.out.println("Toplam Tutar = " + normalTutar + " TL");
                } else {
                    System.out.println("Toplam Tutar = " + (normalTutar-normalTutar*d)*2 + " TL");
                }
            } else {
                if (travelType == 1) {
                    System.out.println("Toplam Tutar = " + atmısBesYas + " TL");
                } else {
                    System.out.println("Toplam Tutar = " + (atmısBesYas-atmısBesYas*d)*2 + " TL");
                }
            } 
        } else {
                System.out.println("Hatalı veri girdiniz!");
        }
        inp.close();
    }
}           