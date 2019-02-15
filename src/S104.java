import java.util.LinkedList;
import java.util.List;

public class S104 {
    public int maxDepth(TreeNode root) {
        List<TreeNodePair> list = new LinkedList<>();
        if (root != null) {
            list.add(new TreeNodePair(root,1));
        }
        int depth = 0;
        while (!list.isEmpty())
        {
            TreeNodePair current = ((LinkedList<TreeNodePair>) list).poll();
            TreeNode r = current.k;
            int curDepth = current.v;
            if(r !=null)
            {
                depth = Math.max(depth,curDepth);
                list.add(new TreeNodePair(r.left,depth+1));
                list.add(new TreeNodePair(r.right,depth+1));
            }
        }
        return depth;
    }
}