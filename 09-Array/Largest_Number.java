 
public class Largest_Number {

    public static int getlarg(int number[]){ //Return allways one value hota in data type function Me. 

        int largest=Integer.MIN_VALUE; //Lergest Number.

        int smallest = Integer.MAX_VALUE; //smallest.
        for(int i=0;i<number.length;i++ ){
            if(largest < number[i]){
                largest = number[i];
            }

            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest Value is: " +smallest);
        return largest;
        
    }
    public static void main(String args[]){
        int number[]={1,2,3,8,9,14};

        System.out.println("Largest value is: "+getlarg(number));
        
    } 
}
