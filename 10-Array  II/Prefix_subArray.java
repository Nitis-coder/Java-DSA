public class Prefix_subArray {

    public static void prefix(int num[]){
        int MAX_sub=Integer.MIN_VALUE;  // sub==sum.
        int Currsum=0;
        int prefix[]= new int[num.length];
        
        prefix[0]=num[0];
        // calcute prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                Currsum= i==0 ? prefix[j] : prefix[j]-prefix[i-1]; //
                  
                
                if(MAX_sub < Currsum){
                    MAX_sub = Currsum;
                }
            }
        }
        System.out.println("Max sum = "+MAX_sub);
        
    }
    public static void main (String args[]){

     int num[]={2,4,6,7,9};
     prefix(num);

    }  
}
