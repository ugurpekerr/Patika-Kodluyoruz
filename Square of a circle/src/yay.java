import java.util.Scanner;
public class yay {
     public static void main(String[] args) {
    double yay, alan, r;
    
    Scanner input=new Scanner(System.in);
    System.out.print("Yay açısını giriniz : ");
    yay=input.nextDouble();
    
    System.out.print("Yarıçapı giriniz : ");
    r=input.nextDouble();
    
    alan = Math.PI*r*r*yay/360;
    System.out.println("Alan : " + alan);
    input.close();
    }
}
