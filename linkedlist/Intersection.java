package CTCI.linkedlist;

import java.util.HashSet;

public class Intersection {
    static Node head1;
    static Node head2;

    public static void main(String[] args) {
        Intersection list = new Intersection();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);

        list.head2 = new Node(4);
        list.head2.next = new Node(6);
        //list.head2.next = list.head1.next;

        System.out.println(intersectionHashing(head1,head2));

        System.out.println(intersection(head1,head2));
    }

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean intersectionHashing(Node head1, Node head2){
        HashSet<Node> set = new HashSet();

        while(head1!=null){
            set.add(head1);
            head1=head1.next;
        }

        while(head2!=null){
            if(set.contains(head2)){
                return true;
            }
            head2=head2.next;
        }
        return false;
    }

    public static boolean intersection(Node head1, Node head2){
        Node pointer1 = head1;
        Node pointer2 = head2;

        while(pointer1!=null || pointer2!=null){
            if(pointer1==null){
                pointer1=head2;
            }
            if(pointer2==null){
                pointer2=head1;
            }
            if(pointer1==pointer2){
                return true;
            }

            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }

        return false;
    }
}

