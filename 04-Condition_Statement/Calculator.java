import java.util.Scanner;

public class Calculator {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value A: ");
        int a=sc.nextInt();
        System.out.print("Enter the value B: ");
        int b=sc.nextInt();
        System.out.print("Enter Your Operator: ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+' :System.out.println(a+b);
                break;
            case '-' :System.out.println(a-b);
                break;
            case '*' :System.out.println(a*b);
                break;
            case '/' :System.out.println(a/b);
            default :System.out.println("Wrong Operant");
        }  
        sc.close();
    }
}
