package Practice;
public class Practice00 {
    public static void main(String[] args) {
        int i, j, k;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4 - i ; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (i = 4; i > 0; i--) {
            for (j = 5; j > i; j--) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * i - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
