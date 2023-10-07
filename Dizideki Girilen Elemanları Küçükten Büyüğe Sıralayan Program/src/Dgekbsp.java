import java.util.Scanner;
import java.util.Arrays;

public class Dgekbsp {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list = new int[n]; 
        int j = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(j + ". Elemanı : ");
            int a = inp.nextInt();
            j++;
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
        inp.close();
    }
}