package Practice;

public class Practice04 {
    public static void main(String[] args) {

        int i, k;
        for (i = 1, k = 1; i < 6; k++) {
            System.out.printf("*");
            if (i <= k) {
                System.out.printf("\n");
                i++;
                k = 0;
            }
        }
    }
}
