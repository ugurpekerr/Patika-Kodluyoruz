import java.util.Scanner;

public class Atm {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int select;
        int right = 3, balance = 1500;
        while (right >= 0) {
        System.out.print("Kullanıcı adınızı giriniz :");
        userName = inp.nextLine();
        System.out.print("Sifrenizi giriniz :");
        password = inp.nextLine();
            if (userName.equals("p") && password.equals("d")) {
                System.out.println("Bankamıza hosgeldiniz. Sizi islemler menüsüne aktarıyorum.");
                do {
                    System.out.println("Lütfen yapacagınız islemi seciniz");
                    System.out.print("1-Para cekme\n2-Para yatırma\n3-Bakiye sorgula\n4-Cıkıs yap\nSeciminiz: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Tutar giriniz: ");
                            int tutar = inp.nextInt();
                            if (tutar>balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                System.out.println("Lütfen paranızı alınız.");
                                balance -= tutar;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;
                        case 2:
                            System.out.print("Tutar giriniz: ");
                            tutar = inp.nextInt();
                            System.out.println(tutar + " TL yatırılmıstır.");
                            balance += tutar;
                            System.out.println("Yeni bakiyeniz: " + balance + "TL");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance + "TL");
                            break;
                    }
                    break;
                } while (select != 4);
                System.out.println("Tekrar görüsmek üzere...");
                break;
            } else {
                System.out.print("Kullanıcı adınız veya sifreniz yanlıs.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println(" Kalan hakkınız :" + right);
                }
                right--;
            }
        }
        inp.close();
    }
}