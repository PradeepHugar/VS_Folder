package DSA;

//Problem: Move all zeroes in an array to the end while keeping the relative order of non-zero elements
public class MoveAllZerosAtEnd {
    public static void main(String[] args){
        int[] arr = {2, 0, 1, 0, 0, 8, 0, 3, 9};
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
                i++;
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
