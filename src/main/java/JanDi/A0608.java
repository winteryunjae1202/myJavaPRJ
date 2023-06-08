package JanDi;

import java.util.Scanner;

public class A0608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("세 변의 길이를 입력하세요 : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(c >= a + b) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else if(Math.pow(c,2) > Math.pow(a,2) + Math.pow(b,2)){
            System.out.println("둔각삼각형입니다.");
        } else if(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
            System.out.println("직각삼각형입니다.");
        } else if(Math.pow(c,2) < Math.pow(a,2) + Math.pow(b,2))
            System.out.println("예각삼각형입니다.");
    }
}
