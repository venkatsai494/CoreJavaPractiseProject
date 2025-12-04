package solution.leetcode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger c = new ConvertBinaryNumberInALinkedListToInteger();
        ListNode node3 = c.new ListNode(1);
        ListNode node2 = c.new ListNode(0, node3);
        ListNode node1 = c.new ListNode(1, node2);
        System.out.println(c.getDecimalValue(node1)); // Output: 5
    }
    public int getDecimalValue(ListNode head) {
        if(head.next == null) return head.val;
        ListNode node1 = head;
        ListNode node2 = head.next;
        StringBuilder sb = new StringBuilder();
        sb.append(node1.val);
        do{
            sb.append(node2.val);
            node1 = node2;
            node2 = node2.next;
        }while(node2 != null);
        return Integer.parseInt(sb.toString(), 2);
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
