import java.util.Scanner;
public class soc {
    public static void main(String[] args) throws Exception {
    double r, alan, cevre;

    Scanner input = new Scanner(System.in);
    System.out.print("Yarıçapı giriniz :");
    r = input.nextDouble();

    alan=Math.PI*r*r;
    cevre=Math.PI*r*2;

    System.out.println("alan:" + alan);
    System.out.println("cevre:" + cevre);
    
    input.close();
    }
}
