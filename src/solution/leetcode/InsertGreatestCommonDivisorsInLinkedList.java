package solution.leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class InsertGreatestCommonDivisorsInLinkedList {
    public static void main(String[] args) {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = new ListNode(18);
        head.next = new ListNode(24);
        head.next.next = new ListNode(36);
        ListNode result = solution.insertGreatestCommonDivisors(head);

        // Print the modified linked list
        while (result != null) {
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
}
