package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){ this.val = val;}
    TreeNode(int val , TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
class BinaryTreeSum{
    public int sumOfInternalNodes(TreeNode root){
        if(root==null || (root.left==null && root.left==null)){
            return 0;
        }
        return root.val +sumOfInternalNodes(root.left)+sumOfInternalNodes(root.right);
    }

}
 class SumInternalNodes {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        BinaryTreeSum method = new BinaryTreeSum();
        System.out.println(method.sumOfInternalNodes(root));

    }
}

