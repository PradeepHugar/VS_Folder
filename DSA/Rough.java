package DSA;
import java.util.*;

public class Rough {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int even_sum = 0;

        for(int i = 0; i < arr.length; i+=2){
            even_sum += arr[i];
        }
        System.out.println(even_sum);
    }
}