import java.util.Scanner;
public class find_key {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the Coloums: ");
        int Coloums=sc.nextInt();
        int matrix[][]=new int [rows][Coloums];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        // find the key in the Array.
        System.out.println("Enter the keys");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == key){
                    System.out.println(i+"i"+","+j+"j");
                }
            }
        }
        sc.close();
    }
}
