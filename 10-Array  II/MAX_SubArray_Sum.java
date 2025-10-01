public class MAX_SubArray_Sum {

    public static void maxsubArray(int num[]){
        int MAX_sub=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<num.length;i++){
            
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+num[k];  // calculate sum.
                    
                    
                }
                if(MAX_sub < sum){
                    MAX_sub = sum;
                }
                System.out.println("sum: "+sum);
                sum=0;
            }
        }
        System.out.println("Maximum of: "+MAX_sub);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        maxsubArray(num);
    }
}
