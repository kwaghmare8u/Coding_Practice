package BinaryTree;

public class PreOrder {

  Node root;

  public PreOrder() {
    root = null;
  }

  public void preOrderTraversal(Node node){

    if (node == null){
      return;
    }
    System.out.println(node.key);
    preOrderTraversal(node.left);
    preOrderTraversal(node.right);

  }

  public static void main(String[] args) {
    PreOrder preOrder = new PreOrder();
    preOrder.root = new Node(1);
    preOrder.root.left = new Node(2);
    preOrder.root.right = new Node(3);
    preOrder.root.left.left = new Node(4);
    preOrder.root.left.right = new Node(5);
    System.out.println("\nPreOrder traversal of binary tree");
    preOrder.preOrderTraversal(preOrder.root);
  }
}
