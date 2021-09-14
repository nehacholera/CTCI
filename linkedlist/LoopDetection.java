package CTCI.linkedlist;

public class LoopDetection {
    static Node head;

    public static void main(String[] args) {
        LoopDetection list = new LoopDetection();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=list.head.next.next;
        System.out.println(loopNode(head).data);
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node loopNode(Node head){
        Node pointer1=head.next;
        Node pointer2=head.next.next;

        while (pointer1 != pointer2) {
             pointer1 = pointer1.next;
             pointer2 = pointer2.next.next;
        }
        pointer1 = head;
        while (pointer1 != pointer2){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}
