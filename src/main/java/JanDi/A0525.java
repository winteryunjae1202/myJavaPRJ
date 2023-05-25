package JanDi;

import java.util.Scanner;

class Circle{
    private int x, y, r;
    Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public int getr(){
        return this.r;
    }
} // 원의 중심 좌표(x, y)로 받고 반지름의 크기를 입력받음
public class A0525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int r1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int r2 = s.nextInt();
        Circle A1 = new Circle(x1, y1, r1);
        Circle A2 = new Circle(x2, y2, r2);
        System.out.println("원 A1의 중심 좌표는 (" + A1.getx() + ", " + A1.gety() + ")이고 원의 반지름은 " + A1.getr() + "입니다.");
        System.out.println("원 A2의 중심 좌표는 (" + A2.getx() + ", " + A2.gety() + ")이고 원의 반지름은 " + A2.getr() + "입니다.");

        double result = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)); // sqrt는 루트 pow(a, b)는 a의 b 제곱
        if(result > r1 + r2){
            System.out.println("두 원은 겹치지 않습니다.");
        }else if(result < r1 + r2){
            System.out.println("두 원은 겹칩니다.");
        }else if(result == r1 + r2){
            System.out.println("두 원은 접합니다.");
        }
    }
}
