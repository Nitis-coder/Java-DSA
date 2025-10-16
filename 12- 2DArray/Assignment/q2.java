package Assignment;
//Print out the sum of the numbers in the second row of the “nums” array. 
public class q2 {
    public static void main(String[] args) {
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3}}; 
        int sum=0;
        //         first. with condition.
        // for(int i=1;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i==1){   
        //         sum=sum+nums[i][j];
        //         }
        //     } 
        // }

        //    secound
        for(int j=0;j<nums[0].length;j++){
            sum += nums[1][j];
        }
        System.out.println("sum: "+sum);
    }
}
