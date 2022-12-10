import java.util.Stack;

public class Palindrome {

    public static boolean isPalindrome(Node head) {
        boolean isPalindrome = false;
        Node nodeBackup = head;
        Stack<String> stack = new Stack<>();
        while (nodeBackup != null){
            stack.push(nodeBackup.data);
            nodeBackup = nodeBackup.ptr;
        }
        while (head != null){
            String x = stack.pop();
            if (head.data == String.valueOf(x)){
                isPalindrome = true;
            }else {
                isPalindrome = false;
                break;
            }
            head=head.ptr;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("N");
        Node nodeB = new Node("A");
        Node nodeC = new Node("M");
        Node nodeD = new Node("A");
        Node nodeE = new Node("N");
        nodeA.ptr = nodeB;
        nodeB.ptr = nodeC;
        nodeC.ptr = nodeD;
        nodeD.ptr = nodeE;

        System.out.println("Palindrome : " + isPalindrome(nodeA));
    }
}


class Node {
    String data;
    Node ptr;

    public Node(String data) {
        this.data = data;
        this.ptr = null;
    }
}
