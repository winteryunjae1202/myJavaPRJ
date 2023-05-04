package JanDi;

import java.util.Scanner;

public class A0504 {
    public static int cal(int a){
        int result;
        result = a * a;
        return result;
    }
    public static void main(String[] args) {
        int result;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        result = cal(i);
        System.out.print(i + "의 제곱은 " + result);
    }
}
