public class Trapping_Water {

    public static void TrappingWater(int Height[]){
        int n=Height.length;
        // Calculate of Left Max  Boundary of Array.
        int leftmax[]=new int[n];
        leftmax[0]=Height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(Height[i],leftmax[i-1]); //(4,2)value hai jisame 4 leftmax hai.
        }
        //Calculate of Right Max boundary of Array.
        int rightmax[]=new int[n];
        rightmax[n-1]=Height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(Height[i],rightmax[i+1]);
        }

        int  trappedwater = 0;
        //Loop
        for(int i=0;i<n;i++){
            //waterLevel = min(leftmaxbound , rightmax bound);
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            // trapped water =waterLevel -Height[i];
            trappedwater +=waterlevel - Height[i];
        }
        System.out.println(trappedwater);

    }
    public static void main(String[] args) {
        int Height[]={4,2,0,6,3,2,5};
        TrappingWater(Height);
    }
    
}
