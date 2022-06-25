import java.util.*;

/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
        List<Integer> postOrder=new ArrayList<>();
        getPostOrderTraversal(root,postOrder);
        return postOrder;
    }
    public static void getPostOrderTraversal(TreeNode root,List<Integer> postOrder){
        if(root==null){
            return;
        }
        getPostOrderTraversal(root.left,postOrder);
        getPostOrderTraversal(root.right,postOrder);
        postOrder.add(root.data);
    }
}