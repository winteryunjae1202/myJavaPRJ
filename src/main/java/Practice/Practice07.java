package Practice;
import java.util.Scanner;
public class Practice07 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int[]arr = new int[5];
        System.out.print("5개의 정수를 입력하세요 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            hap = hap + arr[i];
        }
        System.out.printf("평균 값 : %d / 가장 작은 값 : %d / 평균 값 : %f", max, min, (float)hap/arr.length);
    }
}
