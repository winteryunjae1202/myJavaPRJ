package JanDi;

import java.util.Scanner;

public class A0622 {
    public static float bmi(float a, float b){
        float c;
        c = a / (b*b/10000);
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요 : ");
        float a = s.nextFloat();
        System.out.print("키를 입력하세요 : ");
        float b = s.nextFloat();
        float result = bmi(a,b);
        System.out.println("BMI는 " + result + "입니다.");
        if (result < 18.5){
            System.out.println("저체중입니다.");
        } else if(18.5 <= result && result < 23){
            System.out.println("정상입니다.");
        } else if(23 <= result && result < 25){
            System.out.println("과체중입니다.");
        } else if(result >= 25){
            System.out.println("비만입니다.");
        }
    }
}
