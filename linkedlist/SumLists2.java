package CTCI.linkedlist;

public class SumLists2 {

    static Node head1;
    static Node head2;

    public static void main(String[] args) {
        SumLists2 list1 = new SumLists2();
        SumLists2 list2 = new SumLists2();

        list1.head1 = new Node(7);
        list1.head1.next = new Node(1);
        list2.head1.next.next = new Node(9);
        printList(head1);

        System.out.println("\n");

        list2.head2 = new Node(5);
        list2.head2.next = new Node(9);
        list2.head2.next.next = new Node(9);
        printList(head2);

        System.out.println("\n");

        addTwoNumbers(head1,head2);
    }

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void addTwoNumbers(Node head1, Node head2) {
        Node dummyHead = new Node(0);
        Node p = reverse(head1), q = reverse(head2), curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        printList(reverse(dummyHead.next));
    }

    public static Node reverse(Node head)
    {
        if(head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;
        while(curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
