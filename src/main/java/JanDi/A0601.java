package JanDi;

import java.util.Scanner;

public class A0601 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("임의의 수 하나를 입력하세요 : ");
        int num = s.nextInt();
        int hap = 0;
        int num1 = num;
        while(num1 != 0){
            hap = hap + (num1 % 10);
            num1 = num1 / 10;
        }
        System.out.print(num + "의 각 자리 숫자의 합은 " + hap + "입니다.");
    }
}
