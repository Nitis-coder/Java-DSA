public class Diagonal_Sum {
    public static void diagonalSUM(int matrix[][]){
        int sum=0;
        //<METHOD-1>
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         //primary
        //         if(i == j){
        //             sum=sum+matrix[i][j];
        //         }
        //         //secondary
        //         if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //<METHOD-2>
        for(int i=0;i<matrix.length;i++){
            //primary
            sum+=matrix[i][i];

            //secondary
            if(i != matrix.length-1-i)
               sum+=matrix[i][matrix.length-1-i];
        }
        System.out.println("sum: "+sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        diagonalSUM(matrix);
    }
}
