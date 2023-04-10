package JanDi;

import java.util.Scanner;
public class A0410 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int hap = 0;
        int hap1 = 0;
        a = s.nextInt();
        int arr[] = new int[a];
        for(a = 0; a < arr.length; a++)
        {
            arr[a] = s.nextInt();
        }
        for(a = 0; a < arr.length; a++){
            if(arr[a] % 2 == 0)
            {
                hap += 1;
            }
            else
            {
                hap1 += 1;
            }
        }System.out.printf("%d, %d", hap, hap1);
    }
}
