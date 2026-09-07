package DSA.Practice;

public class InPlaceModification {
    public static void main(String[] args){
        int[] arr = {0, 4, 3, 0, 0, 2, 5, 0, 1};
        int writePtr = 0;
        for(int readPtr = 0; readPtr < arr.length; readPtr++){
            if(arr[readPtr] != 0) arr[writePtr++] = arr[readPtr];
        }
        while(writePtr < arr.length){
            arr[writePtr++] = 0;
        }
        for(int val : arr){
            System.out.print(val);
        }
    }
}
