import java.util.Arrays;
public class TwoDArrayEx {
    public static void main(String[] args){
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 1;
        arr1[0][1] = 3;
        arr1[0][2] = 5;
        arr1[1][0] = 2;
        arr1[1][1] = 4;
        arr1[1][2] = 6;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
        }
        int[][] arr2 = new int[2][4];
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                int temp = i*2;
                arr2[i][j] = temp;
            }
        }
        for(int[] val : arr2){
            System.out.println(Arrays.toString(val));
        }

        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[1];
        jagged[2] = new int[3];
        jagged[0][0] = 1;
        jagged[0][1] = 2;
        jagged[1][0] = 10;
        jagged[2][0] = 20;
        jagged[2][1] = 21;
        jagged[2][2] = 22;
        
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                System.out.println(jagged[i][j]);
            }
        }
    }
}