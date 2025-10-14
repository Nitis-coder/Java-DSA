public class Small_2D {
    public static void main(String args[]){
        int arr[][]={{4,5,2,3},{5,6,4,7}};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] < min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Minimum: "+min);
    }
}
