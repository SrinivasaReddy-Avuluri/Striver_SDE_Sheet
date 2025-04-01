class Solution {
    public int maxProfit(int[] prices) {
        int max=0,out=0;
        for(int i=prices.length-1;i>=0;i--){
            max=Math.max(max,prices[i]);
            out=Math.max(out,max-prices[i]);
        }
        return out;
    }
}