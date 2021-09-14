package clrs.linkedlist;

public class ReturnKthToLast {
    static Node head;

    public static void main(String[] args) {
        ReturnKthToLast list = new ReturnKthToLast();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);

        int k=2;

        //Node kthNode=iterativeK(head,k);
        //Node kthNode=pointerK(head,k);
        recursiveK(head,k);

        /*if(kthNode!=null){
            System.out.println(kthNode.data);
        }*/

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node iterativeK(Node head, int k){
        Node current = head;
        int n =0;

        while(current!=null){
            current=current.next;
            n++;
        }

        if(n>=k){
            current=head;
            for(int i=0;i<n-k;i++){
                current=current.next;
            }
        }
        return current;
    }

    static Node pointerK(Node head, int k){
        Node current = head;

        for(int i=0;current!=null&&i<k;i++){
            current=current.next;
        }

        if(current==null){
            return null;
        }

        while(current!=null){
            current=current.next;
            head=head.next;
        }

        return head;
    }

    static int recursiveK(Node head, int k){
        if (head == null) {
            return 0;
        }

        int count = recursiveK(head.next, k) + 1;

        if (count == k) {
            System.out.println(head.data);
        }
        return count;
    }
}
