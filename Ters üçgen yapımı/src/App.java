import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = inp.nextInt();
        int say=number;
        for (int i=1; i<=say; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*number-1; k++) {
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
        inp.close();
    }
}
