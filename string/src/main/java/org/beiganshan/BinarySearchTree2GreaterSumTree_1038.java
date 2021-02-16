package org.beiganshan;

public class BinarySearchTree2GreaterSumTree_1038 {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {

        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        sum = sum + root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;

    }

}
