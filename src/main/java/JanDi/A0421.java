package JanDi;
import java.util.*;
public class A0421 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 0; i < 3; i++) {
            System.out.print("과일 : ");
            String fruit = s.next();
            System.out.print("가격 : ");
            String price = s.next();
            map = new HashMap<>();
            map.put("fruit", fruit);
            map.put("price", price);

            list.add(map);
            map = null;
        }
        int listsize = list.size();
        for (int i = 0; i < listsize; i++) {
            Map<String, String> rMap = list.get(i);
            System.out.println(rMap.get("fruit") + " : " + rMap.get("price") + "원");
            rMap = null;
        }
    }
}
