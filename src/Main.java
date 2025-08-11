import org.w3c.dom.ls.LSOutput;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Main{
    public static ListNode findMiddle(ListNode head){
        ListNode slow  = head;
        ListNode fast  =  head;
        while(fast!= null & fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head  = new ListNode(1);
        head.next =  new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middle =  findMiddle(head);
        System.out.println("The middle element are :" + middle.val);
    }
}
