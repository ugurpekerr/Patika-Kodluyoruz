import java.util.Scanner;

public class burcBulanProg {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int day, month;
        System.out.print("Hangi gün dogdunuz? : ");
        day = inp.nextInt();
        System.out.print("Kacıncı ayda dogdunuz? : ");
        month = inp.nextInt();    
        if (day > 31 || day < 1 || month < 1 || month > 12) {
            System.out.println("Lütfen günü 1 ile 31, ayı ise 1 ile 12 arasında sayılardan seçiniz.");
        } else {
            if ((day >= 21 && month == 3) || (day <=20 && month == 4)) {
                System.out.println("Koç Burcusunuz :)");
            } else if ((day >= 21 && month == 4) || (day <=21 && month == 5)) {
                System.out.println("Boga Burcusunuz :)");
            } else if (day >= 22 && month == 5 || (day <=22 && month == 6)) {
                System.out.println("Ikizler Burcusunuz :)");
            } else if (day >= 23 && month == 6 || (day <=23 && month == 7)) {
                System.out.println("Yengec Burcusunuz :)");
            } else if (day >= 23 && month == 7 || (day <=22 && month == 8)) {
                System.out.println("Aslan Burcusunuz :)");
            } else if (day >= 23 && month == 8 || (day <=22 && month == 9)) {
                System.out.println("Basak Burcusunuz :)");
            } else if (day >= 23 && month == 9 || (day <=22 && month == 10)) {
                System.out.println("Terazi Burcusunuz :)");
            } else if (day >= 21 && month == 10 || (day <=21 && month == 11)) {
                System.out.println("Akrep Burcusunuz :)");
            } else if (day >= 22 && month == 11 || (day <=21 && month == 12)) {
                System.out.println("Yay Burcusunuz :)");
            } else if (day >= 21 || month == 12 || (day <=21 && month == 1)) {
                System.out.println("Oglak Burcusunuz :)");
            } else if (day >= 22 && month == 1 || (day <=19 && month == 2)) {
                System.out.println("Kova Burcusunuz :)");
            } else if (day >= 20 && month == 2 || (day <=20 && month == 3)) {
                System.out.println("Balık Burcusunuz :)");
            }
        }
        inp.close();
    }
}