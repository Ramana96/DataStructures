package avl_tress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeAvl {
    AvlTreeNode root;

    TreeAvl() {
        root = null;
    }

    public void insert(int number) {
        Stack<AvlTreeNode> avlTreeNodes = new Stack<AvlTreeNode>();
        if (root == null) {
            root = new AvlTreeNode(number);


        } else {
            avlTreeNodes.push(root);
            root.insert(number, avlTreeNodes);
            AvlTreeNode pppppp = root;
        }
    }

    public void inOrder() {
        if (root != null) {
            root.LDR();
        }
    }


    public void level() {
        if (root != null) {
            root.levelOrder(root);
        }
    }


}