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
    public static List < Integer > getInOrderTraversal(TreeNode root) {
        List<Integer> inOrder=new ArrayList<>();
        getInOrderTraversal(root,inOrder);
        return inOrder;
    }
    public static void getInOrderTraversal(TreeNode root,List<Integer> inOrder){
        if(root==null){
            return;
        }
        getInOrderTraversal(root.left,inOrder);
        inOrder.add(root.data);
        getInOrderTraversal(root.right,inOrder);
    }
}