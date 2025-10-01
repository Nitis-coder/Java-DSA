public class SwipingNumber {
    public static void swap(int a,int b){
        
        //Swaping Not Variable.
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a +" b:"+b ); 

    }
    public static void main(String[] args) {
        
        int a=5,b=10;
        //swap with Variable.
        int tem=a;
        a=b;
        b=tem;
        System.out.println("a:"+a +" b:"+b );
 
        
    }
}
