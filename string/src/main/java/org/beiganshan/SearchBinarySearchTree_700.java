package org.beiganshan;
/*
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-a-binary-search-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SearchBinarySearchTree_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        if (root.val == val) {
            res = root;
        } else if ((val < root.val) && (root.left != null)) {
            res = searchBST(root.left, val);
        } else if ((val > root.val) && (root.right != null)) {
            res = searchBST(root.right, val);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(3);
        TreeNode tree2 = new TreeNode(2, tree1, tree3);
        TreeNode tree7 = new TreeNode(7);
        TreeNode tree4 = new TreeNode(4, tree2, tree7);

        SearchBinarySearchTree_700 searchBinarySearchTree_700 = new SearchBinarySearchTree_700();
        TreeNode res = searchBinarySearchTree_700.searchBST(tree4, 2);
        System.out.println(res.val);
    }

}
