package DSA;

/*
maxEndingHere is the maximum sum of a contiguous subarray ending at the current element.
At each element, we decide whether to start a new subarray from the current element or extend the previous subarray, 
whichever gives the larger sum.

Full Kadane concept:
Kadane’s Algorithm finds the maximum subarray sum by checking at each element whether continuing the previous subarray or starting a new one gives a better sum, 
while keeping track of the overall maximum.

*/


//Problem: Find the contiguous subarray with the largest sum.
class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int tempstart = 0;
        int start = 0;
        int end = 0;
        for(int i = 1; i < arr.length; i++){
            int extend = maxEndingHere + arr[i];
            if(arr[i] > extend){
                maxEndingHere = arr[i];
                tempstart =  i;
            }
            else{
                maxEndingHere = extend;
            }
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
                start = tempstart;
                end = i;
            }
        }
        System.out.println("Max sub Array: "+maxSoFar);
        System.out.println("start: "+arr[start]);
        System.out.println("end: "+arr[end]);
    }
}
