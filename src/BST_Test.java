public class BST_Test {
    public static void main(String[] args) {
        BST<String> myTree = new BST<>();
        myTree.insert("một");
        myTree.insert("hai");
        myTree.insert("ba");
        myTree.insert("bốn");
        myTree.insert("năm");
        myTree.inorder();
        System.out.println("Size: "+ myTree.getSize());
        System.out.println("-----------------------------------");
        myTree.inorder();
        System.out.println("Size: "+ myTree.getSize());
    }
}
