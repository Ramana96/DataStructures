package stack_tree_traversals;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode right;
    TreeNode left;

    TreeNode(int data) {
        this.data = data;
        this.right = null;
        this.left = null;

    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
}

public class BinaryTree {

    TreeNode root;

    BinaryTree() {
        root = null;

    }

    public TreeNode insert(int data, TreeNode treeNode) {
        if (this.root == null) {
            TreeNode temp = new TreeNode(data);
            this.root = temp;
            return root;
        }

        if (treeNode == null) {
            TreeNode temp = new TreeNode(data);
            treeNode = temp;
            return treeNode;
        }
        if (treeNode.data > data) {
            treeNode.left = insert(data, treeNode.left);
        } else {
            treeNode.right = insert(data, treeNode.right);
        }
        return treeNode;
    }


    //traversing the tree using stack without recurssion


    public ArrayList preOrderprintTreerintTree(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList a = new ArrayList();
        if (node == null) {
            return a;
        } else {
            stack.push(node);


            while (!stack.isEmpty()) {
                TreeNode t = stack.pop();


                a.add(t.data);
                if (t.right != null) {
                    stack.add(t.right);
                }
                if (t.left != null) {
                    stack.add(t.left);
                }
            }
        }
        return a;

    }


    ///inorder LDR using Stack

    public ArrayList inOrderLDR(TreeNode treeNode) {
        ArrayList al = new ArrayList();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode t = treeNode;
        boolean b = false;
        while (!b) {
            if (t != null) {
                stack.push(t);
                t = t.left;

            } else {
                if (stack.isEmpty()) {
                    b = true;
                } else {
                    t = stack.pop();
                    al.add(t.data);
                    t = t.right;

                }

            }
        }
        return al;
    }

    public void preorderDLR(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            preorderDLR(node.left);
            preorderDLR(node.right);
        }

    }

    //inorder  LDR

    public void inOrderPrintTree(TreeNode node) {
        if (node != null) {
            inOrderPrintTree(node.left);
            System.out.println(node.data);
            inOrderPrintTree(node.right);
        }
    }
//
//
    //postorder traversal

    public void postOrderPrintTree(TreeNode node) {
        if (node != null) {
            postOrderPrintTree(node.left);
            postOrderPrintTree(node.right);
            System.out.println(node.data);
        }
    }


    //////LRD postorder traversal

    public ArrayList stackPostOrderLRD(TreeNode node) {
        ArrayList al = new ArrayList();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (node == null) {
            return al;
        }
        stack.push(node);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (prev == null || prev.right == curr || prev.left == curr) {
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else if (curr.left == prev) {
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else {
                al.add(curr.data);
                stack.pop();
            }
            prev = curr;

        }

        return al;
    }


}
