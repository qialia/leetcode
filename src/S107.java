import java.util.ArrayList;
import java.util.List;

public class S107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
        List <List<Integer>> lists = new ArrayList<>();
        order(lists,0,root);
        for (int i=0,j=lists.size()-1;i<j;i++,j--)
        {
            List<Integer> temp = lists.get(i);
            lists.set(i,lists.get(j));
            lists.set(j,temp);
        }
        return lists;
    }

    private void order(List<List<Integer>> lists, Integer level,TreeNode root)
    {
        if(root == null)
            return;
        if(lists.size() == level)
        {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        }
        else
        {
            lists.get(level).add(root.val);
        }
        order(lists,level+1,root.left);
        order(lists,level+1,root.right);
    }
}
