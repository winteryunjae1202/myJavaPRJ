package JanDi;
import java.util.Scanner;
public class A0411 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        int hap = 0;
        System.out.printf("합계의 시작값 ==> ");
        a = s.nextInt();
        System.out.printf("합계의 끝값 ==> ");
        b = s.nextInt();
        System.out.printf("배수 ==> ");
        c = s.nextInt();
        int k = a;

        while(a <= b)
        {
            if (a % c == 0)
            {
                hap += a;
            } a++;
        }
        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", k, b, c, hap);
    }
}
