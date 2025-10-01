import java.util.Scanner;

public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int A = sc.nextInt();
        if(A>=18){
            System.out.println("you can vote: ");
        }
        else{
            System.out.println("Wrong");
        }
        sc.close();
    }
}
