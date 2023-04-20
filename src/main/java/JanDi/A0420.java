package JanDi;

import java.util.ArrayList;
import java.util.List;

public class A0420 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            list.add(4*i);
        }

        int b = list.size();
        System.out.println("저장된 데이터 수: " + b);
        list.forEach(num-> System.out.println("4 X " + num/4 + " = " + num));
    }
}
