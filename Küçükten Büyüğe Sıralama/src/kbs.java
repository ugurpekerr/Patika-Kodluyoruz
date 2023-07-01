import java.util.Scanner;
public class kbs {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("a sayısını Giriniz : ");
        a = inp.nextInt();
        System.out.print("b sayısını Giriniz : ");
        b = inp.nextInt();
        System.out.print("c sayısını Giriniz : ");
        c = inp.nextInt();
        if (a>b && a>c) {
            if (b>c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }
        } else if (b>a && b>c) {
            if (c>a) {
                System.out.println("a<c<b");
            } else {
                System.out.println("c<a<b");
            }              
        } else {
            if (a>b) {
                System.out.println("b<a<c");
            } else {
            System.out.println("a<b<c");
            }
        }
    inp.close();
    }
}