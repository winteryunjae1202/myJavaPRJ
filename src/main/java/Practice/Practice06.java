package Practice;
import java.util.Scanner;
public class Practice06 {
    public static void main(String[]args){
        int temp = 0;
        Scanner s = new Scanner(System.in);
        int[]arr = new int[5];
        System.out.print("5개의 숫자를 입력하세요 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int k = i + 1; k < arr.length; k++){
                if(arr[i] > arr[k]){
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
