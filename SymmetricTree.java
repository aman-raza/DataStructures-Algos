package com.aman.data_structures;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class SymmetricTree {

    public static void main(String[] args) {
        System.out.println(isSymmetric());
    }

    public static boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if(n1 == null && n2 == null){
                continue;
            }
            if(n1 == null || n2 == null || n1.val != n2.val){
                return false;
            }
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }
}
