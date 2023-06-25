import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Mat notunu girin : ");
        mat = inp.nextInt();
        
        System.out.print("Fizik notunu girin : ");
        fizik = inp.nextInt();
       
        System.out.print("kimya notunu girin : ");
        kimya = inp.nextInt();
      
        System.out.print("turkce notunu girin : ");
        turkce = inp.nextInt();
     
        System.out.print("tarih notunu girin : ");
        tarih = inp.nextInt();
      
        System.out.print("muzik notunu girin : ");
        muzik = inp.nextInt();
        
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz : " + sonuc);
        System.out.println(sonuc < 60 ? "kaldınız" : "gectiniz");

        inp.close();

    }
}