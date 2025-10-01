public class Solid_Rhombus {
    public static void solid(int n){
        //Outer Loop.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ //space n-i
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        solid(5);
    }
}
