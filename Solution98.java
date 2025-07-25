class Solution98 {
    public boolean isIdentical(TreeNode root, TreeNode subrot){
        if(root ==null && subroot ==null){
            return true;

        }
        if(root ==null || subroot ==null){
            return false;

        }
        if(root.val ==subroot.val){
        return isIdentical(root.left ,subroot.left)&& isIdentical(root.right ,subroot.right); 
        }
        return false

    }
    public boolean is Subtree(TreeNode root ,TreeNode subroot){
        if(subroot ==null){
            return true;

        }
        if(root ==null){
            return false;
        }
        if(root.val ==subroot.val ){
            if(isIdentical(root,subroot){
                return true;
            }



        }
        
        return isSubtree(root.left ,subroot) || isSubtree(root.right)
    }   
}
