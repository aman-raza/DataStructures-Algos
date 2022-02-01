package com.aman.data_structures;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;

        private int data; // Generic Type

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first; // root ---> first

        first.left = second;
        first.right = third; // second <--- first ---> third

        second.left = fourth;
//        second.right = fifth; // fourth <--- second ---> fifth
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
//        bt.preOrder(bt.root);
        bt.preOrder();
    }


    // recursive preorder traversal
//    public void preOrder(TreeNode root){
//        if(root == null){
//            return;
//        }
//
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }

    // iterative preorder traversal
    public void preOrder(){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
}
