public class QuickSort {

    public static void quick(int arr[], int si, int ei){
        

        //Base case
        if(si>=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quick(arr, si, pidx-1);//Left side.
        quick(arr, pidx+1, ei);//Right side.

    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei]; //To find the Pivot Element.
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //sweeping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,5};
        quick(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
