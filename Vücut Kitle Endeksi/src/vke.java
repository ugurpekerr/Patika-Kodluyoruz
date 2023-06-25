import java.util.Scanner;
public class vke {
    public static void main(String[] args) throws Exception {
        double boy, kilo, vke;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (m) : ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz (kg) : ");
        kilo = inp.nextDouble();
        vke = kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz: " + vke);
        inp.close();
    }
}
