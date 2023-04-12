package JanDi;

import java.util.Scanner;

public class A0412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
