package JanDi;

import java.util.Arrays;
import java.util.Scanner;

public class A0613 {
    private static void reverseArray(int[]arr) {
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }                                           // 배열 뒤집는 함수 reverseArray 생성
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 숫자를 입력할건가요? : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] sort = Arrays.copyOf(arr, arr.length);     // Arrays.copyOf(배열명, 배열의길이) => 배열명에 들어가는 배열을 새로운 배열을 만들어 저장함.
        Arrays.sort(sort);
        boolean equal1 = Arrays.equals(arr, sort);      // boolean 변수명 = Arrays.equals(배열 1, 배열 2) => 두 배열이 같은 배열인지 여부 확인

        int[] reverse = Arrays.copyOf(sort, sort.length);
        reverseArray(reverse);
        boolean equal2 = Arrays.equals(arr, reverse);

        if((equal1 == false && equal2 == false) || (equal1 == true && equal2 == true)){
            System.out.print("섞임");
        }else if(equal1 == true) {
            System.out.print("오름차순입니다.");
        }else if(equal2 == true){
            System.out.print("내림차순입니다.");
        }
    }
}
