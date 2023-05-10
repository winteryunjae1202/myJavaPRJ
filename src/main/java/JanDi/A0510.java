package JanDi;
class Drink{
    private String drink;
    private int price;
    Drink(String drink, int price){
        this.drink = drink;
        this.price = price;
    }
    public String getDrink(){
        return this.drink;
    }
    public int getPrice(){
        return this.price;
    }
    public void upPrice(int value){
        this.price = this.price + value;
    }
}
public class A0510 {
    public static void main(String[] args) {
        Drink menu1 = new Drink("콜라", 2000);
        Drink menu2 = new Drink("스무디", 3500);

        System.out.println("음료의 이름은 " + menu1.getDrink() + "이며, 가격은 " + menu1.getPrice() + "원입니다.");
        System.out.println("음료의 이름은 " + menu2.getDrink() + "이며, 가격은 " + menu2.getPrice() + "원입니다.");

        menu1.upPrice(300);
        System.out.println(menu1.getDrink() + "의 가격은 " + menu1.getPrice() + "원으로 인상되었습니다.");
        menu2.upPrice(500);
        System.out.println(menu2.getDrink() + "의 가격은 " + menu2.getPrice() + "원으로 인상되었습니다.");

    }
}
