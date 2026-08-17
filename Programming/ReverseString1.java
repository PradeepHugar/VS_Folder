import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//Write a Java program to reverse a string while keeping spaces in their original positions.

public class ReverseString1 {
    public static void main(String[] args){
        System.out.println(reverseStr("Let it happen"));
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
}
