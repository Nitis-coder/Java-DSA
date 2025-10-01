public class Zero_One_Tringle {

    public static void triangle(int n){
        //outerLoop n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){ //innerLoop j=i;
                int sum=i+j;
                if(sum%2==0){  //Consider Number "EVEN" :print-1;
                    System.out.print("1");
                }else{        //Consider Number "ODD" :print-0;
                    System.out.print("0");
                }
            }
            System.out.println(); //NextLine.
        }
    }
    public static void main(String[] args) {
        triangle(4);
    }
}
