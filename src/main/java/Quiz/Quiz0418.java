package Quiz;
import java.util.Scanner;
public class Quiz0418 {
    public static void main(String[] args) {
        int temp; // 자리바꾸기용 변수 temp선언
        Scanner s = new Scanner(System.in); //임의의 숫자 입력받아야하므로 스캐너 추가
        int[]arr = new int[5];  // 5개의 숫자 정렬할것이므로 크기가 5인 배열 선언
        System.out.printf("5개의 숫자를 입력하세요 : ");  // 숫자 5개 입력
        for(int i = 0; i < arr.length; i++){   // 배열의 크기인 5번 반복
            arr[i] = s.nextInt();   // 배열에 5개의 숫자 입력
        }
        for(int i = 0; i < arr.length; i++){    // arr[0]~arr[4]까지 반복
            for(int k = i+1; k < arr.length; k++){  // arr[0]을 arr[0+1]~arr[4]까지 비교
                if(arr[i] < arr[k]){    // 앞쪽항이 뒤쪽항보다 작으면
                    temp = arr[i];      // 뒷항과 앞항을 바꿔서 큰 값을 앞으로 끌고옴
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.printf("%d ", arr[i]);   // arr[0]~arr[4]까지 출력
        }
    }
}
