package Baekjoon;
import java.util.Scanner;
public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        if (a > 0 && b > 0) {
            System.out.printf("1");
        } else if (a > 0 && b < 0) {
            System.out.printf("4");
        } else if (a < 0 && b < 0) {
            System.out.printf("3");
        } else if (a < 0 && b > 0) {
            System.out.printf("2");
        }
    }
}


