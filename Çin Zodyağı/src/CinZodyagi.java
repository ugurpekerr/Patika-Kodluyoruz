import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) throws Exception {
        int birthDate;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum yılınızı giriniz : ");
        birthDate = inp.nextInt();

        if (birthDate %12 == 0) {
            System.out.println("Çin Zodyagı Burcunuz : Maymun");
        } else if (birthDate %12 == 1) {
            System.out.println("Çin Zodyagı Burcunuz : Horoz");
        } else if (birthDate %12 == 2) {
            System.out.println("Çin Zodyagı Burcunuz : Köpek");
        } else if (birthDate %12 == 3) {
            System.out.println("Çin Zodyagı Burcunuz : Domuz");
        } else if (birthDate %12 == 4) {
            System.out.println("Çin Zodyagı Burcunuz : Fare");
        } else if (birthDate %12 == 5) {
            System.out.println("Çin Zodyagı Burcunuz : Okuz");
        } else if (birthDate %12 == 6) {
            System.out.println("Çin Zodyagı Burcunuz : Kaplan");
        } else if (birthDate %12 == 7) {
            System.out.println("Çin Zodyagı Burcunuz : Tavsan");
        } else if (birthDate %12 == 8) {
            System.out.println("Çin Zodyagı Burcunuz : Ejderha");
        } else if (birthDate %12 == 9) {
            System.out.println("Çin Zodyagı Burcunuz : Yılan");
        } else if (birthDate %12 == 10) {
            System.out.println("Çin Zodyagı Burcunuz : At");
        } else if (birthDate %12 == 11) {
            System.out.println("Çin Zodyagı Burcunuz : Koyun");
        }
        inp.close();
    }   
}