package org.beiganshan;
/*
Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
