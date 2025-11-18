package solution.leetcode;


public class InsertGreatestCommonDivisorsInLinkedList {
    public static void main(String[] args) {
        InsertGreatestCommonDivisorsInLinkedList igcd = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = igcd.new ListNode(18);
        head.next = igcd.new ListNode(6);
        head.next.next = igcd.new ListNode(10);
        head.next.next.next = igcd.new ListNode(3);
        ListNode result = igcd.insertGreatestCommonDivisors(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;

        ListNode node1 = head;
        ListNode node2 = head.next;
        while(node2 != null){
            int gcdVal = gcd(node1.val, node2.val);
            ListNode gcdNode = new ListNode(gcdVal);
            node1.next = gcdNode;
            gcdNode.next = node2;
            node1 = node2;
            node2 = node2.next;
        }
        return head;
    }
    public int gcd(int a, int b){
        for(int i = Math.min(a,b); i>0; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
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
