package Quiz;

public class Ex0331_1 {
    public static void main(String[] args) {
        int i, b;

        for (i = 1, b = 5; i < 6; b--) {
            System.out.printf("*");
            if (b <= i) {
                i++;
                b = 6;
                System.out.println("");
            }
        }
    }
}
