public class Deobp {
    public static void main(String[] args) throws Exception {
        int[] list = {5, 2, -5, -2, 12, -12, 6};
        double sum = 0;
        for (double i : list) {
            sum += 1/i;
        }
        System.out.println(list.length/sum);
    }
}
