package JanDi;
import java.util.Scanner;
public class A0605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int mok;
        System.out.println("10과목의 점수를 입력하세요.");
        for(int i = 0; i < 10; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            mok = arr[i] / 10;
            for(int k = 0; k < mok; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
