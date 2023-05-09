package JanDi;

import java.util.Scanner;

public class A0509 {
    public static int[] asc(int ar[]){
        for(int i = 0; i < 5; i++){
            for(int k = i + 1; k < 5; k++){
                if(ar[i] > ar[k]){
                    int temp = ar[i];
                    ar[i] = ar[k];
                    ar[k] = temp;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }
        asc(arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
