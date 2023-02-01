package tree;

public class Node<T extends Comparable<T>> {
  private T value;
  private Node<T> left, right;

  public Node(T value) {
    this.value = value;

    this.left = null;
    this.right = null;
  }

  public void insert(T newValue) {
    if (newValue.compareTo(this.value) < 0) {
      if (this.left == null) {
        this.left = new Node<T>(newValue);
      } else {
        this.left.insert(newValue);
      }
    } else {
      if (this.right == null) {
        this.right = new Node<T>(newValue);
      } else {
        this.right.insert(newValue);
      }
    }
  }

  public boolean find(T searchValue) {
    if (this.value.equals(searchValue)) {
      return true;
    } else if (this.value.compareTo(searchValue) < 0) {
      return this.searchInLeftSubtree(searchValue);
    } else {
      return this.searchInRightSubtree(searchValue);
    }
  }

  private boolean searchInLeftSubtree(T searchValue) {
    return this.left != null && this.left.find(searchValue);
  }

  private boolean searchInRightSubtree(T searchValue) {
    return this.right != null && this.right.find(searchValue);
  }

  public void preorder() {
    System.out.print(this.value + " ");

    if (this.left != null) {
      this.left.preorder();
    }

    if (this.right != null) {
      this.right.preorder();
    }
  }

  public void inorder() {
    if (this.left != null) {
      this.left.inorder();
    }

    System.out.print(this.value + " ");

    if (this.right != null) {
      this.right.inorder();
    }
  }

  public void postorder() {
    if (this.left != null) {
      this.left.postorder();
    }

    if (this.right != null) {
      this.right.postorder();
    }

    System.out.print(this.value + " ");
  }
}
