package JanDi;

import java.util.Scanner;

public class A0615 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 컴퓨터를 놓을건가요? : ");
        int a = s.nextInt();    // 총 컴퓨터 개수
        int b;                  // 작은 책상 개수
        System.out.print("큰책상의 개수를 입력하세요 : ");
        int c = s.nextInt();    // 큰 책상 개수
        if((a-5*c)%4 == 0)
            b = (a-5*c) / 4;
        else
            b = (a-5*c)/4 + 1;
        if(b < c){
            System.out.print("예산 초과입니다.");
        } else {
            System.out.print("필요한 책상의 개수는 " + (b+c) + "개 입니다.");
        }
    }
}
