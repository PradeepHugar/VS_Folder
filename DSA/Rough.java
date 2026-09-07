package DSA;
import java.util.*;

public class Rough {
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int start = 0;
        int end = 0;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for(int i = 0; i < arr.length; i++){
            int extend = maxEndingHere+arr[i];
            if(arr[i] > extend){
                maxEndingHere = arr[i];
            }
            else maxEndingHere = extend;
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
    }
}