package Class;

import java.util.*;

public class CF_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for(int i= 0; i < 3; i++){
            System.out.print("이름 : ");
            String name = s.next();

            System.out.print("이메일 : ");
            String email = s.next();

            System.out.print("부서 : ");
            String dept = s.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }
        int listsize = list.size();
        System.out.println("저장된 데이터 수 : " + listsize);

        System.out.println("1세대 반복문");
        for(int i = 0; i < listsize; i++){
            Map<String, String> rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept") + "\n");
            rMap = null;
        }
        System.out.println("2세대 반복문");
        for(Map<String, String> rMap : list){
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }
        System.out.println("3세대 반복문");
        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
    }
}
