package Matrix;

public class spiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=0;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //left
            for(int i=startCol+1;i<=endRow;i++){
                System.out.print(matrix[i][endRow]+" ");
            }
            //bottom
            for(int j=endRow;j>=0;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //right
            for(int i=endRow-1;i>startRow;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;


        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};
                    printSpiral(matrix);
    }
}
