package avl_tress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AvlTreeNode {
    public AvlTreeNode left;
    public AvlTreeNode right;
    public int data;
    public int height;

    AvlTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;

    }

    public boolean insert(int number, Stack<AvlTreeNode> stack) {
        if (data > number) {
            if (left == null) {
                left = new AvlTreeNode(number);
                stack.push(left);
                height(stack);
                return true;
            } else {
                stack.push(left);
                left.insert(number, stack);
            }
        } else if (data < number) {
            if (right == null) {
                right = new AvlTreeNode(number);
                stack.push(right);
                height(stack);
                return true;
            } else {
                stack.push(right);
                right.insert(number, stack);
            }
        }
        return false;
    }

    public void LDR() {
        System.out.print("    " + data + "  height ::" + height);
        if (left != null) {
            left.LDR();
        }

        if (right != null) {
            right.LDR();
        }

    }

    public void height(Stack<AvlTreeNode> stack) {
        int x, y, leftHeight, rightHeight;
        while (stack.size() > 0) {
            AvlTreeNode temp = stack.pop();
            temp.height = Math.max(x = temp.right == null ? 0 : temp.right.height, y = temp.left == null ? 0 : temp.left.height) + 1;
            leftHeight = (temp.left == null) ? 0 : temp.left.height;
            rightHeight = (temp.right == null) ? 0 : temp.right.height;
            int yppp = temp.data;
//            System.out.println(leftHeight - rightHeight);
            if (leftHeight - rightHeight > 1) {
                System.out.println("to left shift    " + temp.data);


            } else if (leftHeight - rightHeight < -1) {
                System.out.println("to right shift    " + temp.data);
                rotateRight(temp, stack);
            } else {

            }
        }


    }


    public void rotateRight(AvlTreeNode rrNode, Stack<AvlTreeNode> avlTreeNodes) {
        AvlTreeNode temp = rrNode.right;
        AvlTreeNode al = avlTreeNodes.peek();
        al.right = temp;
        rrNode.right = null;
        temp.left = rrNode;
        rrNode.height = 1;


    }


    public void levelOrder(AvlTreeNode node) {
        if (node != null) {
            Queue<AvlTreeNode> treeNodeQueue = new LinkedList<AvlTreeNode>();
            treeNodeQueue.add(node);
            while (!treeNodeQueue.isEmpty()) {
                AvlTreeNode q = treeNodeQueue.remove();
                System.out.println(q.data + "    " + q.height);
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
