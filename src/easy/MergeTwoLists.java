package easy;

public class MergeTwoLists {
    /**
     * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together
     * the nodes of the first two lists.
     * Example:
     * Input: l1 = [1,2,4], l2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * 1->1->2->3->4->4
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return new ListNode();
    }

}
