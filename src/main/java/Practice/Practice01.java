package Practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("입력 값 : ");
        int n = s.nextInt();
        if(n % 6 == 0) {
            System.out.printf("2의 배수와 3의 배수를 만족합니다.");
        }else if(n % 2 == 0){
            System.out.printf("2의 배수입니다.");
        }else if(n % 3 == 0){
            System.out.printf("3의 배수입니다.");
        }
    }
}
