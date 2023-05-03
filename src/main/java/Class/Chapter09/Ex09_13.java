package Class.Chapter09;

import java.util.Scanner;

public class Ex09_13 {
    public static int plus(int v1, int v2){
        int result;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        hap = plus(a, b);
        System.out.printf("%d와 %d의 plus()메소드 결과는 : %d\n", a, b, hap);
    }
}
