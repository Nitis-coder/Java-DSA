public class Merge{

    public static void MergeSort(int arr[], int Si, int Ei){
        //Base case
        if(Si>=Ei){
            return;
        }
        //kaam
        int mid = Si+(Ei-Si)/2;
        MergeSort(arr, Si, mid); //Left part sort.
        MergeSort(arr, mid+1, Ei);//Rigth part sort.

        finalMerge(arr, Si,mid, Ei);
    }

    public static void finalMerge(int arr[], int Si, int mid, int Ei){
        int temp[] = new int[Ei-Si+1];
        int i=Si; //String idx.
        int j=mid+1; //Last idx.
        int k=0;

        while(i<=mid && j<=Ei){
            if(arr[i] < arr[j]){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //Left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //Right part
        while(j <= Ei){
            temp[k++] = arr[j++];
        }

        //copy temp Array into Original Array
        for(i=Si, k=0; k<temp.length; k++, i++){
           arr[i]=temp[k];
        }

    }
    public static void main(String args[]){
        int arr[] = {1,3,7,4,8,5,4};
        int Si = 0;
        int Ei = arr.length-1;
        MergeSort(arr, Si, Ei);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   
}