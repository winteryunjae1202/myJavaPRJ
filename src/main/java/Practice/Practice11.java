package Practice;

public class Practice11 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 1; i < 10; i++) {
            if (i < 6) {
                a++;
            } else {
                a--;
            }
            for (int j = 0; j < a; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
