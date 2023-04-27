package JanDi;

import java.util.*;

public class A0427 {
    public static void main(String[] args) {
        System.out.printf("사칙 연산을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String c = s.next();
        int b = s.nextInt();
        switch(c){
            case "+" : System.out.printf("%d %s %d = %d", a, c, b, a+b); break;
            case "-" : System.out.printf("%d %s %d = %d", a, c, b, a-b); break;
            case "*" : System.out.printf("%d %s %d = %d", a, c, b, a*b); break;
            case "/" : System.out.printf("%d %s %d = %d", a, c, b, a/b); break;
            case "%" : System.out.printf("%d %s %d = %d", a, c, b, a%b); break;
            default : System.out.printf("연산자를 다시 입력하세요.");
        }
    }
}
