public class CycleInAList {
    public boolean isCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
