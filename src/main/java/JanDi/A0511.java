package JanDi;

import java.util.Scanner;

public class A0511 {
    public static int comp(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int k = s.nextInt();
        System.out.printf("%d와 %d 중 큰 수는 %d 입니다.", i, k, comp(i,k));
    }
}
