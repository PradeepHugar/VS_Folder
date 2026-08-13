package DSA;
import java.util.Map;
import java.util.HashMap;


public class Rough {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {3,6,7,9,3,6};
        int target = 15;

        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                System.out.println(map.get(complement) +  " "+ i);;
            }
            map.put(arr[i], i);
        }
    }
}
