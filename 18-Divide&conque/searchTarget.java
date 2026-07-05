public class searchTarget {

    public static int search(int arr[], int target,int si, int ei){
        
        //Base case
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2; //find the mid.
        if(arr[mid] == target){
            return mid;
        }
        
        // to compare the left side
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= target && target <= mid){
                return search(arr, target, si, mid-1);
            }else{
                //case b: rigth
                return search(arr, target, mid+1, ei);
            }
        }else{ //right side compare.
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target  = 0;
        int idxNum = search(arr, target, 0, arr.length-1);
        System.out.println(idxNum);
    }
}
