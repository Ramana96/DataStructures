package tress;


import java.util.LinkedList;
import java.util.Queue;

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


    //traversing the tree

    public void preOrderprintTreerintTree(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            preOrderprintTreerintTree(node.left);
            preOrderprintTreerintTree(node.right);
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


    //postorder traversal

    public void postOrderPrintTree(TreeNode node) {
        if (node != null) {
            postOrderPrintTree(node.left);
            postOrderPrintTree(node.right);
            System.out.println(node.data);

        }
    }


    //level order traversal

    public void levelOrder(TreeNode node) {
        if (node != null) {
            Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
            treeNodeQueue.add(node);
            while (!treeNodeQueue.isEmpty()) {
                TreeNode q = treeNodeQueue.remove();
                System.out.println(q.data);
                if (q.left != null) {
                    treeNodeQueue.add(q.left);
                }
                if (q.right != null) {
                    treeNodeQueue.add(q.right);
                }
            }


        }
    }


}
