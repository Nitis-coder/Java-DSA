package Assignment;
public class bubble_reverse {
    
    public static void reverse(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] < arr[j+1]){   //if 5>4 then;
                    //Swiping  
                    int temp=arr[j];   // t=5  
                    arr[j]=arr[j+1];  //  5 = 4
                    arr[j+1]=temp;   //   4 = 5
                     
                }
               
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
   }
    
    public static void main(String[] args) {
        int arr[]={3,6,7,8,2,3,7};
        reverse(arr);
    }
}
