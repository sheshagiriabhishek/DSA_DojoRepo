//ACCEPTED SOLUTION
//IMPROVEMENT:
//Trace all LL, Tree problems on paper fully, 
//Wear it light, give yourself a very brief overview
class Solution {

    public TreeNode invertTree(TreeNode root) {

        //go to bottom most node (where left)
        if(root==null)
            return null;
        return rec(root);
        
    }


    public TreeNode rec(TreeNode node){

        if(node==null)
            return null;
        TreeNode temp = null;
        if(node.left==null&&node.right==null){
            return node;
        }

        TreeNode lchild = rec(node.left);
        TreeNode rchild = rec(node.right);

        node.left = rchild;
        node.right = lchild;

        return node;
    
    }
}