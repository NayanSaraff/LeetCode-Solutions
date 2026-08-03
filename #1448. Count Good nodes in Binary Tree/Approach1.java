/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();

        int value = countNodes(root, result);

        return value;
    }

    public int countNodes(TreeNode root, List<TreeNode> node) {
        if (root == null)
            return 0;

        int flag = 1;

        for (TreeNode i : node) {
            if (root.val < i.val) {
                flag = 0;
                break;
            }
        }

        node.add(root);

        int right = countNodes(root.right, node);
        int left = countNodes(root.left, node);
        node.remove(node.size() - 1);

        return flag + right + left;
    }
}
