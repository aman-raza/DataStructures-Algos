package com.aman.data_structures;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{
        private int data; // generic type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();  // creating an instance of BinarySearchTree
        bst.insert(6);
        bst.insert(9);
        bst.insert(4);
        bst.insert(2);


        // calling inOrder method & printing the result in sorted form
        bst.inOrder();


        // calling search method & displaying the result
        if(bst.search(9) != null){
            System.out.println("Key Found !!!");
        }
        else{
            System.out.println("Key Not Found !!!");
        }

    }


    // insert a value

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){   // base case
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    // creating inOrder tree traversal for printing the tree data
    // inOrder tree traversal of BinarySearchTree, prints data in sorted form

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    // search a key value

    public TreeNode search(int key){
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
}
