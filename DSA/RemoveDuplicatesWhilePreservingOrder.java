package DSA;
import java.util.*;
public class RemoveDuplicatesWhilePreservingOrder {
    public static void main(String[] args){
        int[] arr = {2, 3, 3, 3, 2, 1, 1, 5, 6 , 6, 4, 4,5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int i = 0;
        int[] newArr = new int[set.size()];
        for(int num : set){
            newArr[i] = num;
            i++;
        }
        for(int num : newArr){
            System.out.print(num+" ");
        }
    }
}
