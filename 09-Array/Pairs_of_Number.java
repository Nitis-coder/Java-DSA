public class Pairs_of_Number {

    public static void pairs(int num[]){
         
        int tot=0;
        for(int i=0;i<num.length;i++){
          int curr=num[i];
          for(int j=i+1;j<num.length;j++){
            System.out.print("("+curr+","+num[j]+")"+" ");
            tot++;
          }
          System.out.println();
        }
        System.out.println("Total pairs of Number: "+tot);
    }
    public static void main(String args[]){
        int num[]={2,3,4,5,6,7,7};
        pairs(num);
    }
}
