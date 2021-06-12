
class ListNode {
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

public class Main {
    public static void main(String[] args) {


    }


    public static ListNode reverseList(ListNode head) {

        ListNode prev = null; //keep track of the previous
        ListNode next = null; //keep track of the next

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static ListNode reverseListRecursive(ListNode head){

        if (head == null && head.next == null){
            return head;
        }
        ListNode reverseListHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListHead;
    }
}
