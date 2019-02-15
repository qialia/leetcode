public class S303 {
    private int []sums;
    public S303(int[] nums) {

        sums = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        sums[0]=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            sums[i]=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i - 1];
        }
    }
}
