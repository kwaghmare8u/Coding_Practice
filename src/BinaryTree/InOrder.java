package BinaryTree;

public class InOrder {

  Node root;

  public InOrder() {
    root = null;
  }

  public void inOrderTraversal(Node node) {

    if (node == null) {
      return;
    }
    inOrderTraversal(node.left);
    System.out.println(node.key + "");

    inOrderTraversal(node.right);
  }

  public static void main(String[] args) {
    InOrder inOrder = new InOrder();
    inOrder.root = new Node(1);
    inOrder.root.left = new Node(2);
    inOrder.root.right = new Node(3);
    inOrder.root.left.left = new Node(4);
    inOrder.root.left.right = new Node(5);
    System.out.println("\nInorder traversal of binary tree");
    inOrder.inOrderTraversal(inOrder.root);
  }
}

