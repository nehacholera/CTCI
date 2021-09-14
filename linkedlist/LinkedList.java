package clrs.linkedlist;

public class LinkedList {

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        LinkedList List = new LinkedList();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        List.display();
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

    public static void add(int data)
    {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

