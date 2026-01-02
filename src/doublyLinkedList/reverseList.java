package doublyLinkedList;

class Node {
    int data;
    Node pre, next;

    public Node(int data) {
        this.data = data;
        this.next = this.pre = null;
    }
}

public class reverseList {
    public static Node reverseList(Node curr) {

        Node temp;
        while (curr.next != null) {
            temp = curr.next;
            curr.next = curr.pre;
            curr.pre = temp;
            curr = temp;
        }
        temp = curr.next;
        curr.next = curr.pre;
        curr.pre = temp;
        return curr;

    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(34);
        head.next = new Node(56);
        head.next.pre = head;
        head.next.next = new Node(89);
        head.next.next.pre = head.next;
        print(head);
        head = reverseList(head);
        print(head);

    }
}
