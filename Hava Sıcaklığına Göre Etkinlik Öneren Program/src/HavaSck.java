import java.util.Scanner;
public class HavaSck {
    public static void main(String[] args) throws Exception {
        int sıcaklık;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklıgını Giriniz : ");
        sıcaklık = inp.nextInt();
            if (sıcaklık <= 5) {
                System.out.println("Hava sıcaklıgı sence de kayak yapmak için uygun degil mi?"); 
            } else if (sıcaklık > 5 && sıcaklık <= 15) {
                System.out.println("Sinemaya gitmek mantıklı gibi görünüyor.");
            }
                if (sıcaklık > 15 && sıcaklık <= 25) {
                    System.out.println("Piknige gitmek için daha ne olması gerekiyor.");
                } else if (sıcaklık > 25) { 
                    System.out.println("Hava çok sıcak bence denize gitmelisinnn");
                }
        inp.close();
    }
}