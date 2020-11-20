public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode;
        int l1length = 1, l2length = 1;
        if(l1.next != null) {
             listNode = l1;
            do {
                l1length++;
                listNode = listNode.next;
            } while (listNode.next != null);
        }
        if(l2.next != null) {
            listNode = l2;
            do {
                l2length++;
                listNode = listNode.next;
            } while (listNode.next != null);
        }
        listNode = null;

        ListNode result =null;
        if(l1length > l2length){
            int x = countNum(0,l1,l1length);
            int y = countNum(0,l2,l2length);
            result = numToNodes(x,y);
        }else if(l1length < l2length){
            int x = countNum(0,l1,l1length);
            int y = countNum(0,l2,l2length);
            result = numToNodes(x,y);
        }else {//equal length
            int x = countNum(0,l1,l1length);
            int y = countNum(0,l2,l2length);
            result = numToNodes(x,y);
        }
        System.out.println();
        return result;
    }
    private static int countNum(int x,ListNode node,int length){
        while (length != 0){
            x += node.val* Math.pow(10,length - 1);
            node = node.next;
            length -= 1;
        }
        return x;
    }
    private static ListNode numToNodes(int x,int y){
        /*convert numbers to nodes*/
        String z = Integer.toString(x + y);
        ListNode [] nodes = new ListNode[z.length()];
        for (int i = z.length() - 1; i >= 0; i--) {
            nodes[i] = new ListNode(z.charAt(i) - '0');
            if(i != z.length() - 1) {
                nodes[i].next = nodes[i + 1];
            }
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
//        listNode.next = new ListNode(4);
//        listNode.next.next = new ListNode(2);
        ListNode listNode2 = new ListNode(8);
        listNode2.next = new ListNode(1);
//        listNode2.next.next = new ListNode(5);
        ListNode restult = addTwoNumbers(listNode,listNode2);
    }
}
