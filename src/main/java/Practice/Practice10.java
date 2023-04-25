package Practice;

import java.util.Scanner;
public class Practice10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int x = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j + 1; k < x; k++) {
                        arr[k - 1] = arr[k];
                    }
                    x--;
                    i = 0;
                    j = 0;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}