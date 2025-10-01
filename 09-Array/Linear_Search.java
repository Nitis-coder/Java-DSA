public class Linear_Search {
    
     //PassByRefrence.
    public static int Linera(int number[],int key){ //Function create.

        for(int i=0;i<number.length;i++){ //going to nth number 
             if(number[i] == key){ //Find out index of [i] on value is equal to key.
                return i;
                 
            }
        }
        return -1;
         
    }
    public static void main(String args[]){
        int number[]={1,3,12,4,5,8,10,24}; //Array
       int key=12;

    //    String number[]={"Nitish","Kumer","thakur"};
    //    String key="nitish";

       int n= (Linera(number, key)); //Store variable n then print.
       System.out.println("Index of: "+n);
    }
}
