package CTCI.linkedlist;

import java.util.HashSet;

public class RemoveDups {

    static Node head;

    public static void main(String[] args) {
        RemoveDups list = new RemoveDups();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);

        list.removeDuplicates();
        //list.removeDuplicatesHashing();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static void removeDuplicates(){
        Node ptr1=head;
        Node ptr2;

        while(ptr1!=null && ptr1.next!=null){
            ptr2=ptr1;

            while(ptr2.next!=null){
                if(ptr1.data==ptr2.next.data){
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }else{
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;
        }
    }

    static void removeDuplicatesHashing(){
        HashSet<Integer> hs = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null)
        {
            int curval = current.data;

            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
