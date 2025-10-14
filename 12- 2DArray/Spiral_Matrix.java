public class Spiral_Matrix {
    public static void spiral(int matrix[][]){
        int startRow=0;
        int startColum=0;
        int EndRow=matrix.length-1;
        int EndColum=matrix[0].length-1;

        while(startRow <= EndRow && startColum <=EndColum){
              
            //Top  j=print column.
            for(int j=startColum;j<=EndColum;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //Right  i=print Row.
            for(int i=startRow+1;i<=EndRow;i++){
                System.out.print(matrix[i][EndColum]+" ");
            }

            //Bottom
            for(int j=EndColum-1;j>=startColum;j--){
                if(startRow == EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][j]+" ");
            }

            //Left
            for(int i=EndRow-1;i>=startRow+1;i--){
                if(startColum == EndColum){
                    break;
                }
                System.out.print(matrix[i][startColum]+" ");
            }

            //Updation
            startColum++;
            startRow++;
            EndColum--;
            EndRow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
        spiral(matrix);
    }
}
