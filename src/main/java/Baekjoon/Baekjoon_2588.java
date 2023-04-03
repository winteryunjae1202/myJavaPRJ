package Baekjoon;
import java.util.Scanner;
public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, b;
        a = S.nextInt();
        b = S.nextInt();
        System.out.printf("%d\n", a*((b%100)%10));
        System.out.printf("%d\n", a*((b%100)/10));
        System.out.printf("%d\n", a*(b/100));
        System.out.printf("%d", a*b);

    }
}
