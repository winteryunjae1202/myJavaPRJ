package JanDi;
import java.util.Scanner;
public class A0413 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num, start;
        int total = 0;
        num = s.nextInt();
        total = s.nextInt();
        int[]arr = new int[num];
        arr[0] = (total - num*(num-1)/2) / num;
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[0] + i;
            System.out.printf("%d ", arr[i]);
        }
    }
}
