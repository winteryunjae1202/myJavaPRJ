package JanDi;

import java.util.Scanner;

public class A0522_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        int a = s.nextInt();
        int score = (89 - time)/5 + a + 1;
        System.out.println("경기가 끝났을 때 우리팀은 " + score + "점을 득점하였습니다.");

    }
}
