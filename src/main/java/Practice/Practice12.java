package Practice;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int []arr = new int[5];
            int temp;
            for( int i = 0; i < arr.length; i++){
                arr[i] = s.nextInt();
                for( int j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        System.out.printf("중복입니다. 해당숫자를 다시 입력하세요. \n");
                        i--;
                    }
                }
            }
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(arr[i] + " ");
            }
        }
}
