public class Create_2D{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{1,2,3,4}};

        //print
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}