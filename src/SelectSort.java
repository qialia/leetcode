public class SelectSort {
//    初始状态：无序区为R[1..n]，有序区为空；
//    从当前无序区中选出关键字最小的记录
//    n-1趟结束，数组有序化了。
    public static void selectSort(int[] a)
    {
        int index = 0;
        int temp = 0;
        for (int i = 0;i<a.length;i++ )
        {
            index = i;
            for ( int j = i;j<a.length;j++)
            {
                if(a[index]>a[j])
                {
                    index =j;
                }
            }

            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
