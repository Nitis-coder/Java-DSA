import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {

    //NOTE,
    // 1. jab ham "Ascending" Order me sort karate hai to =Arrays.sort() ka used karate hai.

    //2. jab ham "Decending" Order me sort karate hai to =Arrays.sort(Collections.reverse()) ka used karate hai.
     



    public static void main(String[] args) {
        //Ascending Order
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         

        System.out.print(" Decending Order  ");
        //Decending Order.
        Integer arr1[]={5,4,1,3,2};
        Arrays.sort(arr1,Collections.reverseOrder());

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}