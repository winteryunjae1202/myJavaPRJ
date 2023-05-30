package JanDi;

import java.util.*;
public class A0530 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        System.out.print("집합 A의 크기를 정하세요.");
        int a = s.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i = 0; i < a; i++){
            input = s.nextInt();
            A.add(input);
        }
        System.out.print("집합 B의 크기를 정하세요.");
        int b = s.nextInt();
        List<Integer> B = new ArrayList<>();
        for(int i = 0; i < b; i++){
            input = s.nextInt();
            B.add(input);
        }
        List<Integer> Inter = new ArrayList<>(A);
        Inter.retainAll(B);                             // 교집합 처리해주는 retainAll
        System.out.println("교집합 : " + Inter);

        Set<Integer> Union = new HashSet<>(A);
        Union.addAll(B);                                // 합집합 처리해주는 addAll
        List<Integer> union1 = new ArrayList<>(Union); // 셋은 중복제거는 가능하지만 정렬이 안되어있을수 있음, 따라서 List로 다시 변환
        System.out.println("합집합 : " + union1);
    }
}
