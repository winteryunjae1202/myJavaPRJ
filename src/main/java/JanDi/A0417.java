package JanDi;
import java.util.Scanner;
public class A0417 {
    public static void main(String[] args) {
        int n;
        int result = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        if(arr[2] - arr[1] == arr[1] - arr[0]){
            result = arr[arr.length-1] + (arr[1] - arr[0]);
        }

        if(arr[2] / arr[1] == arr[1] / arr[0]){
            result = arr[arr.length-1]*(arr[1]/arr[0]);
        }
        System.out.printf("%d", result);
    }
}
