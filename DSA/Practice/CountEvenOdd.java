package DSA.Practice;

public class CountEvenOdd {
    public static void main(String[] args){
        int[] arr = {1,2, 3, 5, 6, 7, 8, 9, 2 ,4, 7};
        int even = 0; int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
