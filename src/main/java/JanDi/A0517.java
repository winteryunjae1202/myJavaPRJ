package JanDi;

import java.util.Arrays;
import java.util.Scanner;

public class A0517 {
    public static void main(String[] args) {
        int hap, cha, gop;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        hap = a + b;
        cha = a - b;
        gop = a * b;
        int arr[] = {hap, cha, gop};
        Arrays.sort(arr);
        System.out.print("합, 차, 곱의 중간 값은 " + arr[1] + "입니다.");
    }
}
