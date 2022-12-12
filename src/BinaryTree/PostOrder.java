package BinaryTree;

public class PostOrder {
  Node root;

  public PostOrder() {
    root = null;
  }

  public void postOrderTraversal(Node node) {
    if (node == null) {
      return;
    }
    postOrderTraversal(node.left);
    postOrderTraversal(node.right);
    System.out.println(node.key);
  }

  public static void main(String[] args) {
    PostOrder postOrder = new PostOrder();
    postOrder.root = new Node(1);
    postOrder.root.left = new Node(2);
    postOrder.root.right = new Node(3);
    postOrder.root.left.left = new Node(4);
    postOrder.root.left.right = new Node(5);
    System.out.println("\nPostOrder traversal of binary tree");
    postOrder.postOrderTraversal(postOrder.root);
  }
}
