package tree;

public class Tree<T extends Comparable<T>> {
  private Node<T> root;

  public boolean find(T searchValue) {
    return this.root != null && this.root.find(searchValue);
  }

  public void insert(T newValue) {
    if (this.root == null) {
      this.root = new Node<T>(newValue);
    } else {
      this.root.insert(newValue);
    }
  }

  public void preorder() {
    if (root == null) {
      return;
    }

    this.root.preorder();
    System.out.println();
  }

  public void inorder() {
    if (root == null) {
      return;
    }

    this.root.inorder();
    System.out.println();
  }

  public void postorder() {
    if (root == null) {
      return;
    }

    this.root.postorder();
    System.out.println();
  }
}
