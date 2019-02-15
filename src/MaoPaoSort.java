public class MaoPaoSort {
//    比较相邻的元素。如果第一个比第二个大，就交换它们两个；
//    对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
//    针对所有的元素重复以上的步骤，除了最后一个；
//    重复步骤1~3，直到排序完成。
    public static void maoPaoSort(int [] a)
    {
        int temp = 0;
        for (int i = 0;i<a.length - 1;i++)
        {
            for (int j = 0;j<a.length - 1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
