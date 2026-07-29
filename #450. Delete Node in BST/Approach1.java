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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return root;
        }

        if(root.left == null && root.right == null && root.val == key)
        {
            root = null;
            return root;
        }

        if(root.val > key) root.left = deleteNode(root.left,key);
        else if(root.val < key) root.right = deleteNode(root.right,key);

        else
        {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            
            TreeNode newnode = inorderTraversal(root.right);
            root.val = newnode.val;
            root.right = deleteNode(root.right,newnode.val);
        }
        return root;
    }

    public TreeNode inorderTraversal(TreeNode root)
    {
        List<TreeNode> result = new ArrayList<>();
        inorder(root,result);
        return result.get(0);
    }
    private void inorder(TreeNode root, List<TreeNode> result)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left,result);
        result.add(root);
        inorder(root.right,result);
    }
}
