package clrs.arraysstring;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] Matrix = new int[][]{{1,2,3},{4,3,0},{0,6,5},{1,2,3}};
        int[][] zerodMatrix=zeroMatrix(Matrix);
        System.out.println(Arrays.deepToString(zerodMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    public static int[][] zeroMatrix(int[][] input){
        boolean zerosFirstRow=false;
        boolean zerosFirstColumn=false;
        for(int j=0;j<input[0].length;j++){
            if (input[0][j] == 0) {
                zerosFirstRow = true;
                break;
            }
        }
        for(int i=0;i<input.length;i++){
            if (input[i][0] == 0) {
                zerosFirstColumn = true;
                break;
            }
        }
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                if(input[i][j]==0){
                    input[i][0]=0;
                    input[0][j]=0;
                }
            }
        }
        for(int i=1;i<input.length;i++){
            for(int j=1;j<input[0].length;j++){
                if(input[0][j]==0 || input[i][0]==0){
                    input[i][j]=0;
                }
            }
        }
        if(zerosFirstRow){
            for(int j=0;j<input[0].length;j++){
                input[0][j]=0;
            }
        }
        if(zerosFirstColumn){
            for(int i=0;i<input.length;i++){
                input[i][0]=0;
            }
        }
        return input;
    }
}
