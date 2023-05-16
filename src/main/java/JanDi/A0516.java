package JanDi;

import java.util.Scanner;

public class A0516 {
    public static void main(String[] args) {
        int hap = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                hap = hap + i;
            }
        }
        System.out.print(a + "의 약수의 합은 " + hap + "입니다.");
    }
}
