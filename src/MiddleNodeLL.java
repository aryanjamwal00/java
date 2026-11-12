public class MiddleNodeLL {
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        //aab aap bahar aa gye ho tho slow mid pr khada hoga
        return slow;
    }
}
