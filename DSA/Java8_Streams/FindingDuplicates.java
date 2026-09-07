package DSA.Java8_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class FindingDuplicates {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 2);
        stock.put("Banana", 3);
        stock.put("Orange", 1);
        
         Set<String> duplicates = stock.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
         System.out.println(duplicates);
    }
}
