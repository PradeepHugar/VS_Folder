package DSA;


public class Rough {
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int start = 0;
        int tempstart = 0;
        int end = 0;
        for(int i = 1; i < arr.length; i++){
            int extend = maxEndingHere + arr[i];
            if(extend > arr[i]){
                maxEndingHere = extend;
            }
            else{
                maxEndingHere = arr[i];
                tempstart =  i;
            }
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
                start = tempstart;
                end = i;
            }
        }
        System.err.println("Max sub array: "+maxSoFar);
        System.out.println("Start index: "+start);
        System.out.println("End index: "+end);
    }
}
