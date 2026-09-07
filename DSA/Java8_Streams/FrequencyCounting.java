package DSA.Java8_Streams;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyCounting {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>(List.of(1, 5,6,7,7, 8,3,2,5, 4,1,2,3,3,4,1,3,2,3));
        Map<Integer, Long> freq = li.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));// Counting returns long
        System.out.println(freq);
    }
}
