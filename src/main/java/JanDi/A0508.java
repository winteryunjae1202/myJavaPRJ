package JanDi;

import java.util.Scanner;

public class A0508 {
    public static int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = factorial(n);
        System.out.print(result);
    }
}
