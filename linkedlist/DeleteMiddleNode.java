package CTCI.linkedlist;

public class DeleteMiddleNode {
    static Node head;

    public static void main(String[] args) {
        DeleteMiddleNode list = new DeleteMiddleNode();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);


        System.out.println("Linked List before removing middle node : \n ");
        list.printList(head);

        list.deleteNode(list.head.next);

        System.out.println("");
        System.out.println("Linked List after removing middle node : \n ");
        list.printList(head);

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNode(Node d) {
        Node temp = d.next;
        d.data = temp.data;
        d.next = temp.next;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
