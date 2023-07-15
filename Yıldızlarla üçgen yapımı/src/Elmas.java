import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int star = inp.nextInt();
        int say=0;
        
        for(int i=0; i<=star; i++){
            for (int j=0; j<(star-i); j++) {
                System.out.print(" ");
            }
            for (int k=0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println("");
            say++;
        }

        for (int a=star; a>=1; a--) {
            for (int c=1; c<=say-star; c++) {
                System.out.print(" ");
            }
            for (int b=0; b<(2*a-1); b++) {
                System.out.print("*");
            }
            System.out.println("");
            say++;
        }
        inp.close();
    }
}