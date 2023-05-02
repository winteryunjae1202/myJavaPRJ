package JanDi;
public class A0502 {
    public static void main(String[] args) {
        int arr[][] = new int[8][9];
        for(int i = 0; i < 8; i++){
            for(int k = 0; k < 9; k++){
                arr[i][k] = (i+2)*(k+1);
                System.out.printf("%dX %d=%2d ", i+2, k+1, arr[i][k]);
            }
            System.out.println();
        }
    }
}
