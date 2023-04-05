package Quiz;

public class Ex0329_1 {
    public static void main(String[] args) {
        int i, k;

        for ( i = 1; i < 10; i++){
            System.out.printf("\n");
            for ( k = 2; k < 10; k++){
                System.out.printf("%dx%d=%2d ", k, i, k*i);
            }
        }
    }
}
