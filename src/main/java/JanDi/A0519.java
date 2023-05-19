package JanDi;

import java.util.Scanner;

public class A0519 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("피보나치 수열에서 몇번째 숫자를 구할것인지 입력하세요 : ");
        int n = s.nextInt();
        int[]arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.printf("피보나치 수열에서 %d번째 숫자는 %d 입니다.", n, arr[n-1]);
    }
}
