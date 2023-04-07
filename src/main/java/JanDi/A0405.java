package JanDi;
import java.util.Scanner;
public class A0405 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("몇개의 숫자를 쓸지 정하세요 : ");
        int n;
        int hap = 0, i;
        float avg;
        n = s.nextInt();
        int[]num = new int[n];
        for(i = 0; i < num.length; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
            num[i] = s.nextInt();}
        int b;
        for(b = 0; b < num.length; b++){
            hap = hap + num[b];
        }avg = hap / (float)(n);
        System.out.printf("평균 ==> %4.1f \n", avg);

    }
}
