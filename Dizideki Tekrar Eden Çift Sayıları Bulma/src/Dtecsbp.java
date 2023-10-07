public class Dtecsbp {
    public static void main(String[] args) throws Exception {
        int[] list = {1, 5, 7, 1, 2, 4, 8, 9, 8, 7, 3, 11, 12, 13, 19, 6, 3, 21};

        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i!=j) && (list[i]==list[j])) {
                    if (list[i] %2 == 0) {
                        System.out.println(list[i]);
                    }
                }
            }
        }
    }
}
