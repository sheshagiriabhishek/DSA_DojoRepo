//IMPROVEMENT:
//Edge case missed
//if(p!=null&&q!=null&&p.val==q.val)
//    {
//        return rec(p.left, q.left) && rec(p.right, q.right);
//   }
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return rec(p, q);
    }


    boolean rec(TreeNode p, TreeNode q){

        if(p==null && q==null)
            return true;

        if(p!=null&&q!=null&&p.val==q.val)
        {
            return rec(p.left, q.left) && rec(p.right, q.right);
        }

        return false;
    }
}