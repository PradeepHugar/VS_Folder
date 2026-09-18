    package DSA;
    import java.util.*;

    // Longest Substring Without Repeating Characters
    public class SlidingWindowEx1 {
        public static void main(String[] args){
            String s = "abcabcbb";
            Map<Character, Integer> map = new HashMap<>();
            int left = 0;
            int maxLength = 0;
            int start = 0;
            for(int right = 0; right < s.length(); right++){
                char c = s.charAt(right);
                if(map.containsKey(c) && map.get(c)>=left) left = map.get(c) + 1;
                map.put(c, right);
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength, right - left+1);
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    start = left;
                }
            }
            System.out.println(maxLength);
            System.out.println(s.substring(start, start+maxLength));
        }
    }
