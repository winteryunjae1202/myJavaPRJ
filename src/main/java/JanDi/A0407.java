package JanDi;
import java.util.Scanner;
public class A0407 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, b, temp ;
        int c = 0;
        int aa[] = new int[5];
        System.out.printf("숫자 5개를 입력하세요 : ");
        for (i = 0; i < aa.length; i++) {
            aa[i] = s.nextInt();
        }
        for (i = 0; i < aa.length; i++) {
            for (b = i + 1; b < aa.length; b++) {
                if (aa[i] == aa[b]) {
                    c = 1;
                    System.out.printf("프로그램을 재시작하세요.");
                    b = 4; i = 4;
                }
            }
        }
        if (c == 0) {
            for (i = 0; i < aa.length; i++) {
                for (b = i + 1; b < aa.length; b++) {
                    if (aa[i] > aa[b]) {
                        temp = aa[b];
                        aa[b] = aa[i];
                        aa[i] = temp;
                    }
                }
                System.out.printf("%d", aa[i]);
            }
        }
    }
}
