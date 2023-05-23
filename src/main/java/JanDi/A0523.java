package JanDi;

import java.util.Scanner;

public class A0523 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        int hap = a;
        for(int i = 1; i < n; i++){
            hap = hap * m + d;
        }
        System.out.println("초항이 " + a + ", 공비가 " + m + ", 공차가 "+ d + "인 수열의 "+ n + "번째 항은 " + hap + "입니다.");
    }
}
