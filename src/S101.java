import java.util.LinkedList;

public class S101 {
    public boolean isSymmetric(TreeNode root) {
//        给定一个二叉树，检查它是否是镜像对称的。
//
//        例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        list.add(root);

        while (!list.isEmpty())
        {
            TreeNode t1 = list.poll();
            TreeNode t2 = list.poll();
            if (t1==null&&t2==null) continue;
            if (t1==null||t2==null) return false;
            if (t1.val !=t2.val) return false;
            list.add(t1.left);
            list.add(t2.right);
            list.add(t1.right);
            list.add(t2.left);
        }
        return true;
    }
}
