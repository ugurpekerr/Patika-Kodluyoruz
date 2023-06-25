import java.util.Scanner;

public class KmHesabi {
    public static void main(String[] args) throws Exception {
    double km, perKm = 2.20, total, startPrice = 10;
    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi Km olarak girin : ");
    km = input.nextDouble();
    
    total = (km * perKm);
    total += startPrice;
    total = (total < 20) ? 20 : total;
    System.out.println("Toplam Tutar : " + total);
    input.close();
    }
}
