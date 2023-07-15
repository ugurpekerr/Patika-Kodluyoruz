import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();
        int tempNumber = number, numberCounter = 0, basTop = 0, basValue;

        while (number != 0) {
            number /= 10;
            numberCounter++;
        }
        System.out.println("Basamak Sayısı: " + numberCounter);

        number = tempNumber;
        for (int i=0; i<numberCounter; i++, number/=10) {
            basValue = number % 10;
            System.out.println("Sayı:" + number + " Son Basamak:" + basValue);
            basTop+=basValue;
        }
        System.out.println("Basamak Sayıları Toplamı: " + basTop);
        inp.close();
    }
}