
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
}
