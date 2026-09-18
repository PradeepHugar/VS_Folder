package DSA;

import java.util.Arrays;

public class KthLargestBySorting {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int KthElement = arr[arr.length - k];
        System.out.println(KthElement);
    }
}