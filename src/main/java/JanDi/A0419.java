package JanDi;
import java.util.Scanner;
public class A0419 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int n = s.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
            hap = hap + arr[i];
        }
        System.out.println(45-hap);
    }
}
