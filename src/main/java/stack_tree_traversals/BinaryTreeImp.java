package stack_tree_traversals;

public class BinaryTreeImp {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1, binaryTree.root);
        binaryTree.insert(2, binaryTree.root);
        binaryTree.insert(3, binaryTree.root);
        binaryTree.insert(-1, binaryTree.root);
        binaryTree.insert(0, binaryTree.root);
        binaryTree.insert(-2, binaryTree.root);
        binaryTree.insert(-1, binaryTree.root);
        binaryTree.insert(0, binaryTree.root);
        binaryTree.insert(-3, binaryTree.root);
//        binaryTree.insert()
//        System.out.println(binaryTree.preOrderprintTreerintTree(binaryTree.root));

//        binaryTree.preorderDLR(binaryTree.root);
        System.out.println("------------------------------------------------------------");

        binaryTree.postOrderPrintTree(binaryTree.root);
        System.out.println("------------------------------------------------------------");

        System.out.println(binaryTree.stackPostOrderLRD(binaryTree.root));


    }
}
