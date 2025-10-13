public class Count_sort{

    public static void countSort(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            Largest=Math.max(Largest ,arr[i]);
        }

        int count[]=new int[Largest+1]; // Create new Array;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++; //count Array me ham arr[i] dal rahe hai;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        
        // for printing 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

         
       
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,4,3,7};
        countSort(arr);
    }
}