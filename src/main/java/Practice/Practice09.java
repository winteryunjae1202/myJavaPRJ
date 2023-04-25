package Practice;
import java.util.Scanner;
public class Practice09 {
    public static void main(String[]args){
        int temp;
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int k = i + 1; k < arr.length; k++){
                if(arr[i] < arr[k]){
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
