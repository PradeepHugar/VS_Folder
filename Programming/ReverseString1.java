import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//Write a Java program to reverse a string while keeping spaces in their original positions.

public class ReverseString1 {
    public static void main(String[] args){
        System.out.println(reverseStr("Let it happen"));
        System.out.println(reverseStrWithoutList("With two pointers only.."));
    }
    public static StringBuilder reverseStr(String s){
        char[] chars = s.toCharArray();
        List<Character> letters = new ArrayList<>();
        for(char c : chars){
            if(c != ' ') letters.add(c);
        }
        Collections.reverse(letters);
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(char c : chars){
            if(c == ' '){
                result.append(c);
            }
            else{
                result.append(letters.get(index));
                index++;
            }
        }
        return result;
    }
    //Two-pointers
    //Without list
    public static String reverseStrWithoutList(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            if(left == ' '){
                left++;
            }
            if(right == ' '){
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
