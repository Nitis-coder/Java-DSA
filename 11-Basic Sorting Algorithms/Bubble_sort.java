public class Bubble_sort {
    public static void bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int sw=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){   //if 5>4 then;
                    //Swiping  
                    int temp=arr[j];   // t=5  
                    arr[j]=arr[j+1];  //  5 = 4
                    arr[j+1]=temp;   //   4 = 5
                    sw++;
                }
               
            }
            // When not swing then excute for  loop. blow code.
            if(sw==0){
                break;
            }
           
           System.out.println("sw"+sw); // print the swipping Number.
        }
         
        //for Array printing.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        // int arr[]={5,4,1,3,2};
        int arr[]={1,2,5,4};
        bubble(arr);
    }    
}
