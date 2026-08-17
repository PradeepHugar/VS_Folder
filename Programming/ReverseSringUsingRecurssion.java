//Reverse string through recursion while keeping the spaces in place
public class ReverseSringUsingRecurssion {
    public static void main(String[] args){
        System.out.println(reverseKeepSpaces("This is Java"));
    }
    public static String reverseKeepSpaces(String s){
        char[] chars = s.toCharArray();
        reverse(chars, 0, chars.length-1);
        return new String(chars);
    }
    public static void reverse(char[] chars, int left, int right){
        if(left>=right){
            return;
        }
        if(chars[left] == ' '){
            reverse(chars, left+1, right);
            return;
        }
        if(chars[right] == ' '){
            reverse(chars, left, right-1);
            return;
        }
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        reverse(chars, left+1, right-1);
    }
}
