import java.util.Scanner;

public class Getest_Number_of_three {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int first=sc.nextInt();
        System.out.print("Enter the secound value: ");
        int second=sc.nextInt();
        System.out.print("Enter the thired value: ");
        int thired=sc.nextInt();

        if((first>=second) && (first>=thired)){
            System.out.println("Largest Number: "+first);
        }
        else if(second>=thired){
            System.out.println("Largest Number: "+second);
        }else{
            System.out.println("Largest Number: "+thired);
        }
        sc.close();
    }
}
