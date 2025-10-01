public class BinomialCofficient {
    public static void bio(){
        int n=5,r=2;

        int N=1; //n
        for(int i=1;i<=n;i++){ //Factorial Number.
            N=N*i;
        }

        int R=1;//r
        for(int i=1;i<=r;i++){ //Factorial Number.
            R=R*i;
        }
        
        int k=n-r; //n-r;
        int b=1;//r
        for(int i=1;i<=k;i++){ //Factorial Number.
            b=b*i;
        }
        System.out.println("N factorial "+N);
        System.out.println("R factorial "+R);
        System.out.println("R-N factorial "+b);
        

        //ncr= n!/r!(n-r)!
        int finalAns=N/(R*b);
        System.out.println("Biomial Coefficient= "+finalAns);
        
    }
    public static void main(String[] args) {
        bio();
        
    }
}
