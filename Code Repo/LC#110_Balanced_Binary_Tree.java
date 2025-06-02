class Solution {

    boolean isTrue = true;

    public boolean isBalanced(TreeNode root) {

        depth(root);

        return isTrue;
        
    }


    public int depth(TreeNode node){

	//Had to be inserted before every other case
	//Thought about it but went wrong

        if(node==null)
            return -1;

        if(node.left==null && node.right==null)
            return 0;
        
        int ldepth = depth(node.left);
        int rdepth = depth(node.right);

        int diff = ldepth - rdepth;
        if(diff<0)
            diff = diff*(-1);
        
        if(diff>1)
            isTrue = false;

        return ldepth>rdepth?ldepth+1:rdepth+1;
        
    }

}

Improvements:

//Had to be inserted before every other case
//Thought about it but went wrong
