package JanDi;
import java.util.Scanner;
public class A0424 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("년도를 입력하세요 : ");
        int n = s.nextInt();
        if( n%4 ==0 && n%100!=0) {
            System.out.printf("%d년은 윤년입니다.", n);
        }
            else if(n%400 == 0) {
            System.out.printf("%d년은 윤년입니다.", n);
        }
            else{
                System.out.printf("%d년은 윤년이 아닙니다.", n);
        }
    }
}
