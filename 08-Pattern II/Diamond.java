public class Diamond {
    public static void dia(int n){
        // 1st part.
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd part.
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        dia(4);
    }
}
