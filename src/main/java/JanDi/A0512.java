package JanDi;
import java.util.Scanner;
public class A0512 {
    public static int sosu(int a){
        int i = 2;
        int b = 0;
        while(i < a){
            if(i == a-1){
                b = 1; i++;
            }else if(a % i == 0){
                b = 0; break;
            }else{
                i++;
            }
        }
        return b == 1 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("검사할 자연수를 입력하세요 : ");
        int a = s.nextInt();
        if(sosu(a) == 1) {
            System.out.print(a + "는 소수입니다.");
        }else if(sosu(a) == 0){
            System.out.print(a + "는 소수가 아닙니다.");
        }
    }
}
