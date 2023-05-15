package JanDi;

import java.util.Scanner;

public class A0515 {
    public static int aaa(int v1, int v2, int v3){
        int gop = v1 * v2;
        int num = 0;
        int num1 = 0;
        for(int i = 1; i <= v1; i++){
            if(v1 % i == 0 && v2 % i == 0){
                num = i;
            }
        }
        int gop1 = gop/num * v3;
        for(int i = 1; i <= v3; i++){
            if(gop/num % i == 0 && v3 % i == 0){
                num1 = i;
            }
        }
        return gop1/num1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.print(a + "와 " + b + "와 " + c + "의 최소공배수는 " + aaa(a, b, c) + "입니다.");
    }
}
