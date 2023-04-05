package Quiz;

public class Ex0331 {
    public static void main(String[] args) {
        int i, b;

        for (i = 1, b = 1; i < 6; b++) {
            System.out.printf("*");
            if (b >= i) {
                i++;
                b = 0;
                System.out.println("");
            }
        }
    }
}
