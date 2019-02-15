import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hello {
    public static void main(String [] args) {
        int[]a = {3,2,5,1};
        SortUtil.print(a);
        SelectSort.selectSort(a);
        SortUtil.print(a);
    }
}
