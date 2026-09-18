package DSA;
import java.util.Map;
import java.util.HashMap;

/*
Problem: Given an array and a target, return indices of two numbers that add up to target. 
Approach: HashMap of value→index; for each element check if target - current was already seen.
*/
public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {12, 24, 16, 8, 20, 0};
        int target = 24;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("The indices are: "+ map.get(complement) + " , " + i);
                //if u need one valid pair then return here
            }
            map.put(arr[i], i);
        }
    }
}
