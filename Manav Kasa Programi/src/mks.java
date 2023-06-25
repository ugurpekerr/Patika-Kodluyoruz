import java.util.Scanner;
public class mks {
    public static void main(String[] args) throws Exception {
        double Armut = 2.14, Elma = 3.67, Domates=1.11, Muz=0.95, Patlican=5.00, tutar;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Armutun ağırlığını giriniz (kg): ");
        Armut *= inp.nextDouble();
        
        System.out.print("Elmanın ağırlığını giriniz (kg): ");
        Elma *= inp.nextDouble();
       
        System.out.print("Domatesin ağırlığını giriniz (kg): ");
        Domates *= inp.nextDouble();
       
        System.out.print("Muzun ağırlığını giriniz (kg): ");
        Muz *= inp.nextDouble();
        
        System.out.print("Patlıcanın ağırlığını giriniz (kg): ");
        Patlican *= inp.nextDouble();
        
        tutar = Armut + Elma + Domates + Muz + Patlican;
        System.out.println("tutar: " + tutar);
        
        inp.close();

    }
}
