public class asal {
    public static void main(String[] args) throws Exception {
        for (int i=2; i<=100; i++) {
            int j=2, say=0;
            while (j<i) {
                if (i %j != 0) {
                    say++;
                } 
                j++;
            }
            if (say == i-2) {
                System.out.print(i + " ");
            }
        }
    }
}