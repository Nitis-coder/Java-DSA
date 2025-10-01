public class Sum {
  public static void add(int num[]){
    int sum=0;
    for(int i=0;i<num.length;i++){
        sum=sum+num[i];
        System.out.print(num[i]+" ");
    }
    System.out.println();
    System.out.print("sum of: "+sum);
  }
  public static void main(String args[]){
    int num[]={2,3,4,5};
    add(num);
  }  
}
