import java.util.Scanner;

public class ebob {
    public static void main(String[] args) throws Exception {
        int i = 1, number1, number2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        number1 = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        number2 = inp.nextInt();

        if (number1 > number2) {
            i = number2; 
            while (i <= number2) {
                if (number1 %i == 0 && number2 %i == 0) {
                    System.out.println("EBOB: " + i);
                    break;
                }
                i--;
            }
        } else {
            i = number1;
            while (i <= number1) {
                if (number1 %i == 0 && number2 %i == 0) {
                System.out.println("EBOB: " + i);
                break;
            }
            i--;
            }
        }
        inp.close();
    }
}