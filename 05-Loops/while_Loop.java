import java.util.Scanner;

public class while_Loop {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int rang= sc.nextInt();
        int count=1;
        while(count<=rang){
            System.out.println(count+" Hello World");
            count++;
           
        }
        sc.close();
    }
}
