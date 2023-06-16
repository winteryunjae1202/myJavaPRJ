package JanDi;

import java.util.Objects;
import java.util.Scanner;

class Menu{
    private String menu1;
    private Integer calorie;

    Menu(String menu1, Integer calorie){
        this.menu1 = menu1;
        this.calorie = calorie;
    }
    public String getmenu(){
        return this.menu1;
    }
    public int getcalorie(){
        return this.calorie;
    }

}
public class A0616 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Menu cheeseburger = new Menu("치즈버거", 400);
        Menu bigmac = new Menu("빅맥", 480);
        Menu milk = new Menu("우유", 170);
        Menu coke = new Menu("콜라", 280);
        Menu salad = new Menu("샐러드", 100);
        int cal = 0;
        System.out.print("메뉴를 몇개 시키실건가요? : ");
        int num = s.nextInt();
        System.out.print(num  + "개의 메뉴를 골라주세요.");
        String[]order = new String[num];
        for(int i = 0; i < num; i++) {
            order[i] = s.next();
            if (Objects.equals(order[i], cheeseburger.getmenu())) {         // 문자형 변수 비교하려면 switch 사용할수 없음
                cal += cheeseburger.getcalorie();                           // 무조건 if(Objects.eqauls(문자형 변수, 비교할 문자열)) => 두 문자가 같으면~
            } else if (Objects.equals(order[i], bigmac.getmenu())){
                cal += bigmac.getcalorie();
            } else if (Objects.equals(order[i], milk.getmenu())) {
                cal += milk.getcalorie();
            } else if (Objects.equals(order[i], coke.getmenu())) {
                cal += coke.getcalorie();
            } else if (Objects.equals(order[i], salad.getmenu())) {
                cal += salad.getcalorie();
            } else {
                System.out.println("메뉴판에 존재하지 않는 메뉴입니다. 다른메뉴를 입력해주세요."); i--;
            }
        }
        System.out.println("주문하신 음식의 칼로리는 " + cal + "입니다.");
        if(cal > 800){
            System.out.println("많은 칼로리를 주문하셨습니다. 주의하세요.");
        } else {
            System.out.println("GOOD");
        }
    }
}
