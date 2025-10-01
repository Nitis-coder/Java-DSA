public class Floyds {
    public static void triangle(){
        int n=5;  // outer Loop for printing 5 Rows.
       int count=1;  // staring variable.
        for(int i=1;i<=n;i++){ // innerLoop for for printing coloums.
            for(int j=1;j<=i;j++){
                System.out.print(" "+count+" "); //print count value.
               count++; //Inisalization value for.
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle();  //function calling.
    }
}
