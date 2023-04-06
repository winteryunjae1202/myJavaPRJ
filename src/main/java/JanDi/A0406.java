package JanDi;

import java.util.Scanner;
public class A0406 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("몇개의 숫자를 입력하실건가요? : ");
        int n, i;
        n = s.nextInt();
        int[] aa = new int[n];
        for (i = 0; i < aa.length; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = s.nextInt();
        }
        int hap = 0;
        for (i = 0; i < aa.length; i++) {
            while (aa[i] != 0) {
                if (aa[i] % 10 == 7) {
                    hap = hap + 1;
                }
                aa[i] = aa[i] / 10;
            }
        }
        System.out.printf("%d", hap);
    }
}
