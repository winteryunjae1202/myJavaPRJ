package JanDi;


public class A0619 {
    public static void main(String[] args) {
        String a = "폭염주의보에도 선수들을 응원하기 위해 야구장을 찾은 두산 팬들은 최악의 주말을 보냈다";
        String split[] = a.split(" ");
        System.out.println("두 번째 단어는 " + split[1] + "입니다.");
        String b = a.substring(3,6);
        System.out.println("3번째부터 6번째 까지의 글자는 " + b + " 입니다.");
    }
}
