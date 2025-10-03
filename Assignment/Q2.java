public class Q2 {

    public static void find(int nums[]){
        int traget = 10;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(traget == nums[i]){
                for(int j=nums[i-1];j>=0;j--){
                    if(min > nums[i]){
                        min = nums[i];
                    }
                    System.out.println(nums[i]);
                }
                
            }else{
                System.out.println("-1");
            }
        }
    }
   
     public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        find(nums);
    }
}
