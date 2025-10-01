public class Hollow_Rectangle {

    public static void hell(int totRows,int totColums ){
        //Outer Loop for Rows Print.
         for(int i=1;i<=totRows;i++){
            //Inner Loop for colums print.
            for(int j=1;j<=totColums;j++){
                if(i== 1 || i==totRows || j== 1 || j==totColums){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

      hell(4, 5);


    //    System.out.println(" "); 
    //       System.out.println(" "); 
    //          System.out.println(" "); 
    //     int totRows=4;
    //     int totColums=5;
         
    //      for(int i=1;i<=totRows;i++){
              
    //         for(int j=1;j<=totColums;j++){
    //             if(i== 1 || i==totRows || j== 1 || j==totColums){
    //                 System.out.print(" x ");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }                       
       
    }
}