package Baekjoon;

import java.util.Scanner;
public class Baekjoon_2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, a, b;
        n = s.nextInt();
        a = 1;
        b = 1;
        while (b <= 100) {
            a++;
            System.out.printf("*");
            if (a > b) {
                a = 1;
                b++;
                System.out.println();
            } else if (n == a) {
                System.out.printf("*");
                b = 101;
            }
        }
    }
}

