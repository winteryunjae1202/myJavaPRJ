package Practice;

public class Practice03 {
    public static void main(String[]args){
        int i, k;
        for(i = 1, k = 2; i < 10; k++){
            System.out.printf("%dX %d=%2d ", k, i, k*i);
            if(k == 9){
                i++;
                k = 1;
                System.out.println();
            }
        }
    }
}