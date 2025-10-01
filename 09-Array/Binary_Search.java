public class Binary_Search {

    public static int binary_search(int number[],int key){
        int start=0, end=number.length-1; //define the start and ends.

        while(start<=end){
            int mid=(start+end)/2;
            //Comparisons Array.
            if(number[mid]==key){
                return mid;  //found
            }
            if(mid>key){ //Left side.
                end=mid-1;
            }else{      //Right side.
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int [] number=new int[13];
        int number[]={2,5,6,8,9,10,12,25,27,28,29};
        int key=9;

        System.out.println("Index of: "+binary_search(number, key));
    }
}
