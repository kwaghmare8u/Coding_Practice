public class NthNodeFromEnd {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printNthNodeFromLast(int input) {

        int length = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        if (length < input) {
            return;
        }

        temp = head;
        for (int i = 1; i < length - input + 1;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        NthNodeFromEnd list = new NthNodeFromEnd();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        list.printNthNodeFromLast(2);

    }
}