package JanDi;

import java.util.Scanner;

public class A0703 {
    public static int test1(int a, int b){
        return (a * 30) / b;
    }
    public static int test2(int a, int b){
        return (a * 40) / b;
    }
    public static int score(int a, int b){
        return (a + b + 30);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("중간고사 점수를 입력하세요 : ");
        int a = s.nextInt();
        System.out.print("중간고사 만점을 입력하세요 : ");
        int b = s.nextInt();
        System.out.print("기말고사 점수를 입력하세요 : ");
        int c = s.nextInt();
        System.out.print("기말고사 만점을 입력하세요 : ");
        int d = s.nextInt();

        int result = score(test1(a,b), test2(c,d));
        System.out.print("1학기 점수는 " + result + "점 입니다.");
    }
}
