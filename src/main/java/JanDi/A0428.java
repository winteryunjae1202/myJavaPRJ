package JanDi;
import java.sql.SQLOutput;
import java.util.*;
public class A0428 {
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
        list.forEach(rMap -> {
            System.out.println("fruit : " + rMap.get("fruit"));
            System.out.println("price : " + rMap.get("price"));
        });
    }
}
