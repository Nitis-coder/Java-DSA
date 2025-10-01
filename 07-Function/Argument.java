 

public class Argument {
     public static void sum(int a,int b){ //function create.
        int  sum=a+b;
        System.out.println("Sum: "+sum);
     }

     public static int multiply(int a,int b){  //Return type Function.
        int  multi=a*b;
        return multi;
     }

    public static void main(String[] args) {
        sum(4,5); // Functiion calling. with Argument.

        int multi=multiply(4, 5);
        System.out.println("Multiplay: "+ multi);

    }
}