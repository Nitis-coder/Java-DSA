public class Inverted_paramid_Number {
    
    public static void Inverted_paramid_WithNumber(int n){
        //outer-Loop 
        for(int i=1;i<=n;i++){  // i=Rows
            for(int j=1;j<=n-i+1;j++){  //j=Coloums.
                System.out.print(i);   //print J beacuse J++(1,2,3,4,5)
           
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        Inverted_paramid_WithNumber(5);
    }
}
