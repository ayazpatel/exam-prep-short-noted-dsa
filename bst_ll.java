
package com.ayafitech.mavenproject1;

class BST_ll_Node {
    int data;
    BST_ll_Node left;
    BST_ll_Node right;
    
    BST_ll_Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class bst_ll {
    BST_ll_Node root;
    
    public BST_ll_Node insert(BST_ll_Node root, int data) {
        BST_ll_Node newNode = new BST_ll_Node(data);
        
        if (root == null) {
            root = newNode;
            return root;
        }
        
        if (root.data < data) {
            root.left = insert(root.left, data);
        } else if (root.data > data) {
            root.right = insert(root.right, data);
        }
        
        return root;
    }
    
    public void preOrder(BST_ll_Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public void inOrder(BST_ll_Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }
    
    public void postOrder(BST_ll_Node root) {
        if (root == null) {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {5, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        bst_ll bst = new bst_ll();
        BST_ll_Node root = null;
        
        for (int i = 0; i < nodes.length; i++) {
            root = bst.insert(root, nodes[i]);
        }
        
        System.out.println("Preorder Traversal:");
        bst.preOrder(root);
        System.out.println("\nInorder Traversal:");
        bst.inOrder(root);
        System.out.println("\nPostorder Traversal:");
        bst.postOrder(root);
        
        
    
    }
    
}
