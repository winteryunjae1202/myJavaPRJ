package Baekjoon;
import java.util.Scanner;

public class Baekjoon_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a == b && b == c) {
            System.out.printf("%d", 10000 + a * 1000);
        } else if (a == b || c == a) {
            System.out.printf("%d", 1000 + a * 100);
        } else if (b == c) {
            System.out.printf("%d", 1000 + b * 100);
        } else if (a >= b && a >= c) {
            System.out.printf("%d", a * 100);
        } else if (b >= a && b >= c) {
            System.out.printf("%d", b * 100);
        } else if (c >= a && c >= b) {
            System.out.printf("%d", c * 100);
        }
    }
}

