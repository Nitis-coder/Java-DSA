public class BY_Reference {
    public static void mak(int marks[]){ // function creat  as mak in argument(int marks)
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1; // marks in Array add one.
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};  // create Array.
        
        mak(marks);  // Calling.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
