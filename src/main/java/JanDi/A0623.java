package JanDi;
import java.util.Scanner;

public class A0623 {
    public static void main(String[] args) {    // 아무것도 없는 맵 0 시야있는곳 1 렌즈로지워진 시야 2
        Scanner s = new Scanner(System.in);
        int i, k;
        int arr[][] = new int[9][9];
        for (i = 0; i < 9; i++) {
            for (k = 0; k < 9; k++) {
                arr[i][k] = 0;              // 기본 맵의 모든 좌표를 0으로 설정
            }
        }
        System.out.print("와드의 위치를 좌표로 입력하세요 : ");
        int a = s.nextInt();
        int b = s.nextInt();
        for (i = a - 2; i <= a + 2; i++) {
            if (a - 2 < 0) {
                i = 1;
            } else if (i == 9) {
                break;
            } else {
                for (k = b - 2; k <= b + 2; k++) {
                    if (b - 2 < 0) {
                        k = 1;
                    } else if (k == 9) {
                        break;
                    }
                    arr[i][k] = 1;
                }// 와드를 박은곳 주변 2칸을 1로 설정
            }
        }
        System.out.print("렌즈의 위치를 좌표로 입력하세요 : ");
        int c = s.nextInt();
        int d = s.nextInt();
        for (i = c - 2; i <= c + 2; i++) {
            if (c - 2 < 0) {
                i = 1;
            } else if (i == 9) {
                break;
            } else {
                for (k = d - 2; k <= d + 2; k++) {
                    if (d - 2 < 0) {
                        k = 1;
                    } else if (k == 9) {
                        break;
                    }
                    if (arr[i][k] == 0) {
                        arr[i][k] = 3;
                    } else if (arr[i][k] == 1) {
                        arr[i][k] = 2;
                    }
                }
            }
        }
        for(i = 0; i < 9; i++){
            for(k = 0; k < 9; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }
}
