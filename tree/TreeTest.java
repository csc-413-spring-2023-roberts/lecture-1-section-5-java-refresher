package tree;

public class TreeTest {
  public static void main(String[] args) {
    Tree<Integer> tree = new Tree<>();

    System.out.println(
        String.format("Trying to find 42 in an empty tree: %s", tree.find(42) ? "true" : "false"));

    tree.insert(42);
    tree.insert(7);
    tree.insert(100);
    tree.insert(3);
    tree.insert(200);
    tree.insert(225);
    tree.insert(30);
    tree.insert(99);

    System.out.println(
        String.format("Trying to find 42 in a non-empty tree: %s", tree.find(42) ? "true" : "false"));
    System.out.println(
        String.format("Trying to find 999 in a non-empty tree: %s", tree.find(999) ? "true" : "false"));

    System.out.println("PREORDER TRAVERSAL");
    tree.preorder();

    System.out.println("INORDER TRAVERSAL");
    tree.inorder();

    System.out.println("POSTORDER TRAVERSAL");
    tree.postorder();
  }
}
