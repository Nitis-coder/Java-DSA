import java.util.Scanner;

public class Qn1{
    public static void main(String args[]){
        Scanner sc=new Scanner( System.in);
        do{
            System.out.print("Enter your Number: ");
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println("Your are Enter the ten Multiple.");
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}