import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    int a;
    String username, password;
    
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Kullanıcı adı giriniz : ");
    username = inp.nextLine();
    
    System.out.print("Sifrenizi giriniz : ");
    password = inp.nextLine();
    
    if (username.equals("patika") && password.equals("1234")) { 
        System.out.println("Giris yapılıyor...");
    } else { 
        System.out.println("Kullanıcı adı veya sifreniz yanlıs");
        System.out.println("Kullanıcı adınızı veya sifrenizi sıfırlamak ister misiniz?");
        System.out.println("1-Evet\n2-Hayır");
        a = inp.nextInt();
            if (a==1) {System.out.println("Sifre sıfırlama sayfasına yönlendiriliyorsunuz.");
            }else if (a==2) { System.out.println("Bilgilerinizi tekrar giriniz.");
            }else{System.out.println("Lütfen 1 veya 2 rakamlarından birini seçiniz.");}    
    }
    inp.close();
    }
}
