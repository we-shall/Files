/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author vishalsingh
 */
public class BinaryTree {
    
    public static void main(String[] args) {
        
        //COMPLETE BINARY TREE//
        
        // a complete binary tree is a tree such that every level is completely
        // filled except the last level
        // but again leaf nodes should be as left as possible okay?
        
        //FULL BINARY TREE//
        
        // a full binary tree is complete binary tree 
        // but every node except the leaf node should have two children
        
        Tree tree = new Tree();
        
        tree.insertElement(34);
        tree.insertElement(4);
        tree.insertElement(39);
        tree.insertElement(3);
        tree.insertElement(1);
        tree.insertElement(41);
        
        tree.traverseIN();
        
        System.out.println("preorder traversal....");
        tree.traversePRE();
        
        
        System.out.println("postorder traversal....");
        tree.traversePOST();
        
        System.out.println("tree data:" + tree.getNode(4));
        System.out.println("tree min: " + tree.minimum());
        System.out.println("tree max: " + tree.maximum());
        
        tree.delete(4);
        
        tree.traverseIN();
        
    }
    
}


class Tree 
{
    private TreeNode root;
    
    void insertElement (int data)
    {
        if (root == null) 
            root = new TreeNode(data);
        else
            root.insert(data);
        
    }
    
    void traverseIN()
    {
        if (root != null)
            root.traverseInorder();
    }
    
    void traversePRE(){
        if (root != null)
            root.traversePreorder();
    }
    
    void traversePOST(){
        if (root != null)
            root.traversePostorder();
    }
    
    
    TreeNode getNode(int value)
    {
        if (root!= null)
            return root.getNode(value);
        return null;
    }
    
    int minimum ()
    {
        if (root != null)
            return root.min();
        
        return 99999;
    }
    
    int maximum ()
    {
        if (root != null)
            return root.max();
        
        return -99999;
    }
    
    void delete (int value)
    {
        root = delete (root, value);   
    }
    
    private TreeNode delete(TreeNode subTree, int value)
    {
        // when the root is null
        if (subTree == null)
            return subTree;
        
        //when
        if ( value < subTree.getData() )
        {
            subTree.setLeft(delete(subTree.getLeft(),value));
        }
        else if (value > subTree.getData())
        {
            subTree.setRight(delete(subTree.getRight(),value));
        }
        else
        {
            // deleting node with either 0 or 1 child
            if (subTree.getLeft() == null)
            {
                return subTree.getRight();
            }
            else if (subTree.getRight() == null)
            {
                return subTree.getLeft();
            }
            
            // deleting node with 2 children
            
            // setting the predecessor data to the deleting node..
            subTree.setData(subTree.getRight().min());
            
            // now the 
            subTree.setRight(delete(subTree.getRight(),subTree.getData()));
            
        }
        
        return subTree;
    }
    
    
}



class TreeNode {
    
    private int data;
    private TreeNode left,right;
  
    TreeNode (int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    int min (){
        
        
        if (left == null)
            return data;
        return left.min();
            
    }
    
    
    int max ()
    { 
        if (right == null)
            return data;
        return right.min();
            
    }
    
    
    
    void insert(int value)
    {
        if (data == value)
            return;
        TreeNode node = new TreeNode(value);
        if (data > value)
        {
            if (left == null)
            {
                left = node;
            }
            else
            {
                left.insert(value);
            }
        }
        else
        {
            if (right == null)
            {
                right= node;
            }
            else
            {
                right.insert(value);
            }
            
        }
    }
    
    

    TreeNode getNode (int value)
    {
        if (data == value)
            return this;
        
        if (value < data)
        {
            if (left != null)
            {
                return left.getNode(value);
            }
        }
        else if (value > data)
        {
            if (right != null)
            {
                return right.getNode(value);
            }
        }
        return null;
    }
    
    void traverseInorder()
    {
        if (left != null)
            left.traverseInorder();
        System.out.println("data->" + data);
        if (right != null)
            right.traverseInorder();
        
    }
    
    void traversePreorder ()
    {
        System.out.println("data --> "  + data);
        if (left != null)
            left.traversePreorder();
        if (right != null)
            right.traversePreorder();
    }
    
    void traversePostorder ()
    {
        
        if (left != null)
            left.traversePreorder();
        if (right != null)
            right.traversePreorder();
        System.out.println("data --> "  + data);
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }
    
    public String toString (){
        return "left child " + data + " right challenge";
    }
    
}