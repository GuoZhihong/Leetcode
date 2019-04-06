import java.util.Stack;

/*
206. Reverse Linked List
Easy

2126

59

Favorite

Share
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
* */
public class ReverseLinkedList206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        ListNode newNode = reverseList(head);
        while (newNode != null){
            System.out.print(newNode.val+",");
            newNode = newNode.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            ListNode node = new ListNode(head.val);
            stack.push(node);
            head = head.next;
        }
        ListNode newNode = stack.pop();
        ListNode newHead = newNode;
        while (!stack.empty()){
            newNode.next = stack.pop();
            newNode = newNode.next;
        }
        return newHead;
    }

}

