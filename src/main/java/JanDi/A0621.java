package JanDi;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class A0621 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        System.out.println("숫자를 몇 개 입력하실건가요?");
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        System.out.print("입력값 : ");
        for(int i = 0; i < cnt; i++){
            int num = s.nextInt();
            numbers.add(num);
        }
        Collections.sort(numbers);
        System.out.print("출력값 : ");
        numbers.forEach((num) -> System.out.print(num + " "));
    }
}
