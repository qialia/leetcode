public class A01 {
    public int removeDuplicates(int[] nums) {
        //双指针法，一次只需要移动一个元素
        if(nums.length==0) return 0;
        int i = 0;
        for (int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}