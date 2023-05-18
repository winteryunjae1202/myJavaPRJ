package JanDi;

import java.util.Scanner;

public class A0518 {
    public static void main(String[] args) {
        int a, b;
        int age = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("YYMMDD 형식으로 생년월일을 입력 후 주민번호 뒷자리 첫자리를 입력해주세요.");
        a = s.nextInt();
        b = s.nextInt();
        if(b == 1 || b == 2){
            age = 2023-(a/10000+1900)+1;
        }
        else if(b == 3 || b == 4){
            age = 2023-(a/10000+2000)+1;
        }
        System.out.print("2023년 기준 나이는 " + age + "세입니다.");
    }
}
