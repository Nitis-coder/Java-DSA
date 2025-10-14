public class Largest_2D {
    public static int MAX(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] > largest ) {
                    largest=arr[i][j];
                }
            }  
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{1,2,3,4}};
        int p=MAX(arr);
        System.out.println(p);
    }
}
