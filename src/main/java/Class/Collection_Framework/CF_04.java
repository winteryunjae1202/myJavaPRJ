package Class.Collection_Framework;
import java.util.*;
import java.util.HashSet;
public class CF_04 {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            set.add(s.nextInt());
        }
        System.out.print(set);
    }
}
