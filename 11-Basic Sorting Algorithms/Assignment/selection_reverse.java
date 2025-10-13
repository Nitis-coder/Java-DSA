package Assignment;

public class selection_reverse {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPosition=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPosition] < arr[j]){  
                    minPosition = j;     //  0 = 2 
                }
            }
             
            int temp=arr[minPosition]; // t = 1
            arr[minPosition]=arr[i];  // 1 = 5
            arr[i]=temp; // 5 = 1 
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection(arr);
    }
}
