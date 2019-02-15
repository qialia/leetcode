public class S121 {
    public int maxProfit(int[] prices) {
//买卖股票的最佳时机
        if (prices.length==0) return 0;
        int min = prices[0];
        int max = 0;
        int res = 0;
        for (int i = 0;i<prices.length;i++)
        {
            if (prices[i]>min)
            {
                max = prices[i] -min;
            }
            min = Math.min(min,prices[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}
