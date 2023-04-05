package Quiz;

public class Ex0331_2 {
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
        if (i > 5) {
            for (i = 1, b = 4; i < 5; b--) {
                System.out.printf("*");
                if (b <= i) {
                    i++;
                    b = 5;
                    System.out.println("");
                }
            }
        }
    }
}


