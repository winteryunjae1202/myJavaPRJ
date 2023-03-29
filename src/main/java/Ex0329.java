import java.util.Scanner;
public class Ex0329 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.printf("2의 배수와 3의 배수를 만족합니다. \n");
        } else if (a % 2 == 0) {
            System.out.printf("2의 배수를 만족합니다. \n");
        } else if (a % 3 == 0) {
            System.out.printf("3의 배수를 만족합니다. \n");
        }
    }
}