package Class.Chapter11;
class Car{
    public String color;
    public int speed;
    public void upSpeed(int value) {
        this.speed = this.speed + value;
    }
    public void downSpeed(int value){
        this.speed = this.speed - value;
    }
}
public class Ex11_01 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.color = "red";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "blue";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "yellow";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재속도는 " + myCar1.speed + "km입니다.");
        myCar1.downSpeed(15);
        System.out.println("자동차1의 현재속도는 " + myCar1.speed + "km입니다.");
        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재속도는 " + myCar2.speed + "km입니다.");
        myCar3.upSpeed(1);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재속도는 " + myCar3.speed + "km입니다.");


    }
}
