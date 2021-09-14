package CTCI.linkedlist;

public class Partition {
    static Node head;

    public static void main(String[] args) {
        Partition list = new Partition();
        list.head = new Node(3);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next = new Node(1);

        list.printList(head);
        System.out.println("\n");
        partition(head,5);
    }

    static class Node {
        int data;
        Node next;

         Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static void partition(Node head, int k){
        Node newHead=head.next;
        Node temp=head;

        while(newHead!=null) {
            if (newHead.data < k) {
                temp.next = newHead.next;
                newHead.next = head;
                head = newHead;
                newHead = temp.next;
            } else {
                temp = temp.next;
                newHead = newHead.next;
            }
        }
        printList(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
