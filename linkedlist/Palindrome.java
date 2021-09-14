package CTCI.linkedlist;

import java.util.Stack;

public class Palindrome {

    static class Node{
        Node next;
        int value;
        public Node(int value){
            next = null;
            this.value = value;
        }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));
        System.out.println(isPalindromeReverse(head));
    }

    private static boolean isPalindromeReverse(Node head) {
        Node pointer1 = head;
        Node pointer2 = head;
        while (pointer2 != null && pointer2.next != null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }

        Node prev = null;
        while (pointer1 != null){
            Node temp = pointer1.next;
            pointer1.next = prev;
            prev = pointer1;
            pointer1 = temp;
        }

        while (prev != null){
            if (prev.value != head.value){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }


    private static boolean isPalindrome(Node head) {
        Node newHead = head;
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.value);
            head = head.next;
        }
        while (newHead != null){
            if(stack.pop() != newHead.value){
                return false;
            }
            newHead = newHead.next;
        }
        return true;
    }
}
}
