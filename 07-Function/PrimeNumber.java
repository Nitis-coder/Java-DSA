public class PrimeNumber {

    
     public static boolean isPrime(int n){
           //<Long Method>
        // boolean isPrime=true;
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         isPrime=false;
        //         break;
        //     } 
        // }
        // return isPrime;
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
     }
    public static void main(String[] args) {
      System.out.println( isPrime(2)); 
    }
}
