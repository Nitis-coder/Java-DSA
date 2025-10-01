public class Inverted_Rotated {
    
    public static void Inverted_Rotated_Half_pyamid(int n){

        for(int i=1;i<=n;i++){
             
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");//space print.
            }

            for(int j=1;j<=i;j++){
                //System.out.print(" "+i+" ");
                System.out.print("x");
            }
            System.out.println();
        }
    }
    // Secound Methods 
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.println(j<=5-i && j<=4 ? "x":" ");
    //     }
    //  }
    public static void main(String[] args) {
        Inverted_Rotated_Half_pyamid(5);
    }
}
