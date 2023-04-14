package JanDi;

import java.util.Scanner;

public class A0414 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 1;
        for (int n = 1; n <= a; n++, i++) {
            while (i % 3 == 0 || i % 10 == 3 || i / 10 == 3) {
                i++;
            }
            if (n == a) {
                break;
            }
        }
        System.out.printf("%d ", i);
    }
}

