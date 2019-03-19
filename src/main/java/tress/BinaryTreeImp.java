package tress;

public class BinaryTreeImp {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10, binaryTree.root);
        binaryTree.insert(11, binaryTree.root);
        binaryTree.insert(12, binaryTree.root);
        binaryTree.insert(5, binaryTree.root);
        binaryTree.insert(8, binaryTree.root);
        binaryTree.insert(3, binaryTree.root);
        binaryTree.insert(4, binaryTree.root);
//        binaryTree.insert(4, binaryTree.root);

        binaryTree.insert(24, binaryTree.root);
        binaryTree.insert(2, binaryTree.root);
//        binaryTree.insert(1, binaryTree.root);
//        binaryTree.insert(1, binaryTree.root);
//        binaryTree.insert(5, binaryTree.root);
//        binaryTree.insert(12,binaryTree.root);
//        binaryTree.insert(9,binaryTree.root);
//        System.out.println(binaryTree.root.data);
//        System.out.println(binaryTree.root.right.data);

//        binaryTree.preOrderprintTreerintTree(binaryTree.root);

        System.out.println("Inorder Traversal");
//        binaryTree.inOrderPrintTree(binaryTree.root);
//        BinaryTree b=new BinaryTree();

        binaryTree.levelOrder(binaryTree.root);


        System.out.println("Postorder ");

//        binaryTree.postOrderPrintTree(binaryTree.root);


//        BinaryTree c=new BinaryTree();
//        b.insert(10,b.root);
//      c=b;
//        System.out.println(b.root.data);
//c.root.data=121;
//c.root.right=new TreeNode(12);
//        System.out.println(b.root.data);
//        System.out.println(b.root.right.data);


    }
}
