import java.util.Arrays;

public class Def {
    public static void main(String[] args) throws Exception {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        for(int i=0; i < list.length; i++){
            int counter = 1;
            while(i+1 < list.length && list[i]==list[i+1]){
                i++;
                counter++;
            }
            System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
        }
    }
}