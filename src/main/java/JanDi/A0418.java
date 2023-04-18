package JanDi;
import java.util.Scanner;
public class A0418 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int b = 0;
        int hap = 0;
        int x = 0;
        int a = s.nextInt();
        int c = a;
        while(c!=0) {
            c = c / 10;
            x++;
        }
        int []arr = new int[x];
        while(a!=0){
            arr[b] = a%10;
            b++;
            a = a/10;
        }
        for(int i = 0; i < arr.length; i++){
            hap = hap + arr[i];
        }
        System.out.printf("%d", hap);
    }
}
