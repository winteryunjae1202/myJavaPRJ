package Quiz;

public class Ex0330_1 {
    public static void main(String[] args) {
        int i, k;

        for (i = 2, k = 1; i < 10; k++) {
            if (k > 9) {
                System.out.printf("\n");
                k = 0;
                i++;
            }
            else System.out.printf("%d x %d = %2d ", i, k, i * k);
        }
    }
}

