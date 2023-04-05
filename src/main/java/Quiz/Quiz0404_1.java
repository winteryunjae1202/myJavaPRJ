package Quiz;

public class Quiz0404_1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        while (a < 10){
            b++;
            System.out.printf("%dX %d = %2d ", a, b, a*b);
            if(b == 9){
                a++;
                b=0;
                System.out.println();
            }
        }
    }
}
