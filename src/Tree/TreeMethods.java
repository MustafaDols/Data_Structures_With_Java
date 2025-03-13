package Tree;

class A {
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);

        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }
    public static TreeNode searchInBinarySearchTree(TreeNode root , int val){
        if(root == null) return  null;
        if(root.val==val) return root;
        else if(root.val>val) return searchInBinarySearchTree(root.left,val);
        return searchInBinarySearchTree(root.right,val);
    }

    public static int RangeSumBST(TreeNode root , int low , int high){
        if (root == null) return 0;
        if(root.val>= low && root.val<= high)
            return root.val+RangeSumBST(root.left,low,high)+RangeSumBST(root.right,low,high);
        else {
            return RangeSumBST(root.left,low,high)+RangeSumBST(root.right,low,high);
        }

    }

    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original , TreeNode cloned , final TreeNode target){

        if(cloned==null) return null;
        if(cloned.val==target.val){
            ans=cloned;
        }
        getTargetCopy(original,cloned.left,target);
        getTargetCopy(original,cloned.right,target);
        return ans;

    }

    public boolean LogicGatesTree(TreeNode root){
        if(root.val==0) return false;
        if(root.val==1) return true;

        if (root.val==2){
            return LogicGatesTree(root.left) || LogicGatesTree(root.right);
        }
        return LogicGatesTree(root.left) && LogicGatesTree(root.right);
    }

    public static boolean  isSameTree(TreeNode p , TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null){
            return false;
        }
        if(q==null){
            return false;
        }
        if(p.val!=q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right , q.right);
    }

    public static int sumOfLeftLeaves(TreeNode root){
        if(root==null) return 0;
        if(root.left==null) return sumOfLeftLeaves(root.right);
        if(root.left.left==null && root.left.right==null){
            return root.left.val + sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

    }

}



