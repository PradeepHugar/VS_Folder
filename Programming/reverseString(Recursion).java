class reverseStringRecursion {
    public static void main(String[] args){
        System.out.println(reverse("Pradeep"));
        System.out.println(charArrReverse("Hugar"));
    }
    //Using Substring
    //Time-complexity = O(n^2)
    public static String reverse(String str){

        if(str.length() <= 1){
            return str;
        }

        return str.charAt(str.length()-1)+reverse(str.substring(0, str.length() - 1));
    }
    public static String charArrReverse(String str){
        char[] chArr = str.toCharArray();
        charArrReverse(chArr, 0, chArr.length-1);
        return new String(chArr);
    }
    public static void charArrReverse(char[] chArr, int left, int right){
        
        if(left >= right){
            return;
        }
        char temp = chArr[left];
        chArr[left] = chArr[right]; 
        chArr[right] = temp;
        
        charArrReverse(chArr, left+1, right-1);
    }
}
