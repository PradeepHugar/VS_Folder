package DSA.Arrays;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 5, 2, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);

        //To Find the largest frequency
        int maxFrequency = 0;
        int mostFrequent = arr[0];
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent element: "+mostFrequent);
        System.out.println("Max frequency: "+maxFrequency);
    }
}
