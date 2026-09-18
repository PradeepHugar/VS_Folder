package DSA;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        int[] nums = {12, 35, 1, 10, 34, 1};
        int largest = nums[0];
        int sencondLargest = nums[1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                sencondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > sencondLargest && nums[i] != largest){
                sencondLargest = nums[i];
            }
        }
        System.out.println("Second distinct largest element is: "+sencondLargest);
    }
}
