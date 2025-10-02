public class Buy_Sell {

    public static void buysell(int prices[]){
        int buyprices=Integer.MAX_VALUE; // minimum prices to buy stacks.
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyprices < prices[i]){
                int profit = prices[i]-buyprices; // today`s profit
                maxprofit = Math.max(profit , maxprofit);
          
            }else{
                buyprices =prices[i];
            }
        }
        System.out.println(maxprofit);
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        buysell(prices);
    }
}