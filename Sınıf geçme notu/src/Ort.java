import java.util.Scanner;
public class Ort {
    public static void main(String[] args) throws Exception {
        int mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();
        
        if (mat > 0 && mat < 100 && fizik > 0 && fizik < 100 && kimya > 0 && kimya < 100 && turkce > 0 && turkce < 100 && muzik > 0 && muzik < 100) {
            average = (mat + fizik + turkce + kimya + muzik) / 5;
            System.out.print("Ortamalanız : " + average);
        } else {
            System.out.print("Lütfen notlarınızı 0 ile 100 arasında sayılar ile giriniz.");
        }
        inp.close();
    }
}
        

            