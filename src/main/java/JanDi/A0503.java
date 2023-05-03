package JanDi;

public class A0503 {
    public static int gop(int v1, int v2){
        int result;
        result = v1 * v2;
        return result;
    }

    public static void main(String[] args) {
        int result;
        for(int i = 2; i < 10; i++){
            for(int k = 1; k < 10; k++){
                result = gop(i, k);
                System.out.printf("%dX %d=%2d ", i, k, result);
            }
            System.out.println();
        }
    }
}
