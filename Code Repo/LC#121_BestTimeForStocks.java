class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int[] maxAfter = new int[n];
        //Iterate array backward from n-2 index till 0
        //each element recompute max
        //store in appropriate index in the array
        int maxProfit = 0;
        maxAfter[n-1] = prices[n-1];
        if(n==1||n==0)
        return 0;
        //#MISTAKE: Had done i++ instead of i--
        for(int i=n-2; i>=0; i--){
            
            if(prices[i]>maxAfter[i+1])
                maxAfter[i]  = prices[i];
            //#MISTAKE: Had not written else case
            else 
                maxAfter[i]  = maxAfter[i+1];
            
        }

        // for(int i=0; i<maxAfter.length; i++)
        //     System.out.println(maxAfter[i]);

        for(int i=0; i<prices.length-1; i++){
            if( maxAfter[i+1] - prices[i] > maxProfit)
                maxProfit  = maxAfter[i] - prices[i];
        }

        return maxProfit;

    }
}