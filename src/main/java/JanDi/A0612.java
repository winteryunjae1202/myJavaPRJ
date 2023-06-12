package JanDi;

import java.util.Scanner;

public class A0612 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ax + b = c 형태의 일차방정식을 입력하세요. (단, 계수항과 상수항은 9를 초과하지않는다.)");
        String a1 = s.nextLine();
        int bx1 = (a1.indexOf("x"));
        int by1 = (a1.indexOf(a1.charAt(a1.indexOf("=")-2)));
        int c1 = (a1.indexOf(a1.charAt(a1.indexOf("=")+2)));
        System.out.println("계수는 " + a1.charAt(bx1-1) + " " + a1.charAt(by1) +  " 상수는 " + a1.charAt(c1));
        int a = a1.charAt(bx1-1) - '0';
        int b = a1.charAt(by1) - '0';
        int c = a1.charAt(c1) - '0';        // char 타입을 int로 변환하려면 끝에 -'0'을 붙인다.
        if((c-b) % a != 0){
            System.out.println("해를 구할 수 없습니다.");
        }else if((c-b) % a == 0) {
            System.out.println("일차방정식의 해는 " + (c - b) / a + "입니다.");
        }
    }
}
