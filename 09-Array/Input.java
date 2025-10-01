import java.util.Scanner;

public class Input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int marks[]=new int[3];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        

        System.out.println("Math: "+marks[0]+", Eng: "+marks[1]+", Phy: "+marks[2]);
        System.out.println("Length: "+marks.length);
         
        sc.close();
    }
}
