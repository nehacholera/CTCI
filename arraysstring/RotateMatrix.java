package clrs.arraysstring;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotatedMatrix=rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(rotatedMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    public static int[][] rotateMatrix(int[][] input){
        int length = input.length-1;
        for(int i=0;i< input.length/2;i++){
            for(int j=i;j< input.length-1;j++){
                int temp = input[i][j];
                input[i][j]=input[length-j][i];
                input[length-j][i]=input[length-i][length-j];
                input[length-i][length-j]=input[j][length-i];
                input[j][length-i]=temp;
            }
        }
        return input;
    }
}
