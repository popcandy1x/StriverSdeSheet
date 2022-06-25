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
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
        List<Integer> preOrder=new ArrayList<>();
        getPreOrderTraversal(root,preOrder);
        return preOrder;
    }
    public static void getPreOrderTraversal(TreeNode root,List<Integer> preOrder){
        if(root==null){
            return;
        }
        preOrder.add(root.data);
        getPreOrderTraversal(root.left,preOrder);
        getPreOrderTraversal(root.right,preOrder);
    }
}