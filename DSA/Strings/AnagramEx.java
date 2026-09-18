package DSA;

public class AnagramEx {
    public static void main(String[] args){
        String A = "Anagram";
        String B = "Nagaram";

        String a = A.toLowerCase();
        String b = B.toLowerCase();

        int[] arr = new int[26];

        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            return;
        }
        for(char c : a.toCharArray()) arr[c - 'a']++;
        for(char c : b.toCharArray()) arr[c - 'a']--;
        for(int i : arr){
            if(i != 0){
                System.out.println("Not a Valid Anagram");
                return;
            }
        }
        System.out.println("Valid Anagram");
    }
}
