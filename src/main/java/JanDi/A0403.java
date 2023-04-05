package JanDi;
import java.util.Scanner;

public class A0403 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.printf("정수 2개를 입력하세요.\n");
        int a;
        int b, c;
        b = S.nextInt();
        c = S.nextInt();
        for (a = 1; a < 5; a++) {
            System.out.printf("%d X %d = %d ", a, b, a * b);
        }
            System.out.println();

            for (a = 5; a < 10; a++) {
                System.out.printf("%d + %d = %d ", a, c, a + c);
                c+=3;
            }
        System.out.println();

    }
}
