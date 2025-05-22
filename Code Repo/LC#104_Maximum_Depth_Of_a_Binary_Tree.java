class Solution {
    public int maxDepth(TreeNode root) {

        return  rec(root);
        
    }


    public int rec(TreeNode node){

        if(node==null)
            return 0;
        
        int ldepth = rec(node.left);
        int rdepth = rec(node.right);
        int depth = ldepth==Math.max(ldepth, rdepth)?ldepth+1:rdepth+1;
        
        return depth;

    }
}