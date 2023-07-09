import java.util.Scanner;

public class ayh {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int yıl;
        System.out.print("Yılı giriniz : ");
        yıl = inp.nextInt();

        if (yıl %400 == 0) {
            System.out.println(yıl + " Bir artık yıldır.");        
        } else {
            if (yıl %4 == 0) {
                if (yıl %100 == 0) {
                    System.out.println(yıl + " Bir artık yıl degildir");
                } else {
                    if (yıl %4 == 0) {
                        System.out.println(yıl + " Bir artık yıldır.");
                    }
                }
            } else {
                System.out.println(yıl + " Bir artık yıl degildir.");
            }
            inp.close();
        }
    }
}               