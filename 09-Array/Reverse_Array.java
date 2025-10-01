public class Reverse_Array {
     
    public static void reverse(int number[]){
         
        int first=0,last=number.length-1;

        while(first < last){
            //Swapping Number.
            int temp=number[last];
            number[last]=number[first]; //last into first.
            number[first]=temp;

            first++; //first increment;
            last--;  // last decement;
        }
        //Print value of Array.
        for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7};  
        reverse(number);   
    }
}
