package Practice;

public class Practice02 {
    public static void main(String[] args) {
        int i, k;
        for (i = 1; i < 10; i++) {
            for (k = 2; k < 10; k++) {
                System.out.printf("%dX %d =%2d ", k, i, k * i);
            }
            System.out.println();
        }
    }
}
