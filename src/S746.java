public class S746 {
    public int minCostClimbingStairs(int[] cost) {
//        数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
//
//        每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
//
//        您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。

        int fucka =0;
        int fuckb =0;
        int allCost = 0;
        for(int i = 0;i<cost.length-1;i++){
            if(cost[i]+fucka > cost[i+1]+fuckb)
                allCost = cost[i+1]+fuckb;
            else
                allCost = cost[i]+fucka;
            fucka = fuckb;
            fuckb = allCost;

        }
        return allCost;
    }
}
