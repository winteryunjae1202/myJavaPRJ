package JanDi;
import java.util.Scanner;
public class A0609 {
    public static int test(int a, int b){
        int num;
        if(a < 4 || b < 16){
            num = 1;
        }else if((2*a + 2*b) < 60){
            num = 1;
        }else
            num = 0;
        return num;
    }
    public static int score(int a, int b){
        return (2*a + 2*b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1과목 정답 개수를 입력하세요 : ");
        int a = s.nextInt();
        System.out.print("2과목 정답 개수를 입력하세요 : ");
        int b = s.nextInt();
        if(test(a,b) == 0){
            System.out.println("축하드립니다. 합격입니다! 점수는 " + score(a, b) + "점 입니다.");
        }else if(test(a,b) == 1){
            System.out.println("불합격입니다. 점수는 " +  score(a, b) + "점 입니다.");
        }
        System.out.print("SQLD 파이팅!");
    }
}
