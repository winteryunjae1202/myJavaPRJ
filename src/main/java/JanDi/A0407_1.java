package JanDi;
import java.util.Scanner;
public class A0407_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, b, n;
        int temp = 0;
        int i = 0;
        int c = 0;
        System.out.printf("몇 개의 숫자을 입력하나요? : ");
        n = s.nextInt();
        int arr[]= new int[n];
            num = s.nextInt();
        while(num != 0) {
            for (i = 0; i < arr.length; i++) {
                arr[i] = num % 10;
                num = num / 10;
            }
        }
        for(i = 0; i < arr.length; i++){
            for(b = i + 1; b < arr.length; b++){
                if(arr[i] == arr[b]){
                    c = 1;
                    System.out.printf("프로그램을 재시작하세요.");
                    b = n; i = n;
                }
            }
        }
        if(c == 0){
            for(i = 0; i < arr.length; i++){
                for(b = i + 1; b < arr.length; b++){
                    if(arr[i]>arr[b]){
                        temp = arr[b];
                        arr[b] = arr[i];
                        arr[i] = temp;
                    }
                }System.out.printf("%d ", arr[i]);
            }
        }
    }
}
