public class Search_sortedArray {
    public static void ser(int matrix[][]){
        int key=32;
        // for(int i=0;i<matrix.length;i++){
        //     if(matrix[i][matrix.length-1-i]==key){
        //         System.out.print("Search by the Row: "+key);
        //     }
        // }

        for(int j=0;j<matrix[0].length;j++){
            if(matrix[matrix.length-1-j][j]==key){
                System.out.print("found key at: ");
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        ser(matrix);
        
    }
}
