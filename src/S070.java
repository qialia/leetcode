public class S070 {
    public int climbStairs(int n) {
//爬楼梯
        if(n==1)return 1;
        int []arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i=2;i<n;i++)
        {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
