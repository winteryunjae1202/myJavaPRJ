package JanDi;

import java.util.Scanner;

public class A0614 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("휴지통에 찬 용량을 입력하세요. ");
        int n = s.nextInt();
        int a = n % 10;
        int nn = n/10;
        int b = nn % 10;
        int c = (10*a + b)*2;
        System.out.println("휴지통의 압축 후 용량 : " + c);
        if(c <= 50) {
            System.out.print("GOOD");
        }else{
            System.out.print("BAD");
        }
    }
}
