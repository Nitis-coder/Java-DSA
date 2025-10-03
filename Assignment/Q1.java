package Assignment;

//Question 1: Given an integer array nums, return true if any value appears at least twice in 
//the array, and return false if every element is distinct. 
public class Q1 {
    public static Boolean calls(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }

   public static void main(String args[]){
       int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       calls(nums);
    } 
}
