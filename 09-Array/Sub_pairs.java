public class Sub_pairs {

    public static void sub(int num[]){
        int tot=0;
        int sum=0; // sum declearer.
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    sum=sum+num[k]; //sum value 
                    System.out.print(num[k]+"     ");
                }
                tot++;
                System.out.println();
                System.out.println("Sum: "+sum); // sum print.
                sum=0;
            }
            System.out.println();
        }
        System.out.println("Total numbe of: "+tot);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        sub(num);
    }
}
