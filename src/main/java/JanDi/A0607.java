package JanDi;

import java.util.Scanner;

public class A0607 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("두 수를 입력하세요 : ");
        double a = s.nextDouble();
        double b = s.nextDouble();

        double hap = a + b;
        double cha1 = a - b;
        double cha2 = b - a;
        double gop = a * b;
        double mok1 = a / b;
        double mok2 = b / a;
        double jegop1 = Math.pow(a,b);
        double jegop2 = Math.pow(b,a);

        double []arr = {hap, cha1, cha2, gop, mok1, mok2, jegop1, jegop2};
        double max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
