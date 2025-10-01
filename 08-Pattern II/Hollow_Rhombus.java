public class Hollow_Rhombus {
    public static void Hellow(int n){
        for(int i=1;i<=n;i++){
            //space n-i.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print * n tak.
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){ // अगर पहली row, आखिरी row, पहला column या आखिरी column है → "*", print होगा वरना " " => i=rows ,j=>coloum.
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hellow(4);
    }
}
