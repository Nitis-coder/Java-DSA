package Assignment;
//Question 1 : Print the number of 7’s that are in the 2d array. 
public class q1 {
    public static void main(String[] args) {
        int arr[][]={{1,2,7,5},{5,6,7,0}};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("count: "+count);
    } 
}
