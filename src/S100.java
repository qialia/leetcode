
public class S100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //相同的树
        if(p==null&&q==null)
            return true;

        if(p!=null&&q!=null&&p.val==q.val)
        {
            return (isSameTree(p.left,q.left))&&(isSameTree(p.right,q.right));
        }
        else
        {
            return false;
        }
    }
}