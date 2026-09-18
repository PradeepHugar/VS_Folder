package DSA;

public class LargestIn2DArray {
    public static void main(String[] args){
        int[][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 4;
        arr[1][0] = 1;
        arr[1][1] = 3;

        int max = arr[0][0];
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max is: "+max);
    }
}
