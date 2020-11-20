import java.util.ArrayList;
import java.util.List;

public class MiddleoftheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode middleNode(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        if(head.next == null){
            return head;
        }
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }

        if(nodeList.size() % 2 == 0){
            return nodeList.get(nodeList.size()/2);
        }else {
            return nodeList.get(nodeList.size()/2 + 1);
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        System.out.println(middleNode(listNode1));
    }
}
