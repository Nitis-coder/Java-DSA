import java.util.Scanner;

public class IncomeTexCal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); // let input
        System.out.print("Enter your Income: ");
        int income =sc.nextInt();
        int tex;

        if(income < 50000){
            tex=0;
        }else if(income >=500000 && income <1000000){
            tex =(int) (income*0.20);
        }else {
             tex=(int) (income*0.30);
        }
        System.out.println("Your tex: " + tex);
    }
}
