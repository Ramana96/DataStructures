package avl_tress;

public class Imple {
    public static void main(String[] args) {
        TreeAvl t = new TreeAvl();
        t.insert(5);
        t.insert(4);
        t.insert(9);
        t.insert(3);
        t.insert(17);
        t.level();
        System.out.println("================================================");
//        t.insert(7);
        t.insert(19);
        t.level();
        System.out.println("================================================");
//        t.insert(-1);
        t.insert(2001);
        t.level();
        System.out.println("================================================");
        t.insert(2002);
//        t.insert(2007);
//        t.inOrder();
//        t.level();
    }
}
