package Practice;

public class Practice05 {
    public static void main(String[]args){
        int i = 1;
        int k = 2;
        while(k <= 9){
            System.out.printf("%dX %d =%2d ", k, i, k*i);
            i++;
            if(i == 10){
                i = 1;
                k++;
                System.out.println();
            }
        }
    }
}
