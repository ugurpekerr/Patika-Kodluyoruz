import java.util.Scanner;

public class ms {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int total=0;

        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();

        for (int i=1; i < number; i++) {
            if (number % i == 0) {
                total+=i;
            }
        }

        if (total==number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı degildir.");
        }
        inp.close();
    }
}