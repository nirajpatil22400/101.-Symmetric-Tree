/*
    -------------------Symmetric Tree (Mirror Image of itself)-----------------------------------
    
    The idea is to write a recursive function isMirror() that takes two trees as an argument and returns true if trees are the mirror and false if trees are not mirrored. The isMirror() function recursively checks two roots and subtrees under the root.

Below is the implementation of the above algorithm.
    
*/

// Java program to check is binary tree is symmetric or not

class Solution
{
    // returns true if the tree is symmetric i.e
    // mirror image of itself
    
    public boolean isSymmetric(TreeNode root)
    {
        // check if tree is mirror of itself
        
        return isMirror(root, root);
    } 
    
    // returns true if trees with roots as root1 and
    // root2 are mirror
    
    public boolean isMirror(TreeNode p, TreeNode q)
    {
        // if both trees are empty, then they are mirror image
        
        if (p == null && q == null)
            return true;
 
        // For two trees to be mirror images, the following
        // three conditions must be true
        // 1.) Their root node's val must be same
        // 2.) left subtree of left tree and right subtree
        // of right tree have to be mirror images
        // 3.) right subtree of left tree and left subtree
        // of right tree have to be mirror images
        
        if (p != null && q != null && p.val == q.val)
            return (isMirror(p.left, q.right) && isMirror(p.right, q.left));
 
        // if none of the above conditions is true then
        // root1 and root2 are not mirror images
        
        return false;
    }
}

/*
Time Complexity: O(N)
Auxiliary Space: O(h) where h is the maximum height of the tree
*/